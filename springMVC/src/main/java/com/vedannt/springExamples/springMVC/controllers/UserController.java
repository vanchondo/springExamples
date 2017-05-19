package com.vedannt.springExamples.springMVC.controllers;

import javax.servlet.ServletException;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vedannt.springExamples.springMVC.models.User;
import com.vedannt.springExamples.springMVC.services.UserService;

/**
 * Created by vanchondo on 5/18/17.
 */
@RestController
@RequestMapping(value = "/user/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method= RequestMethod.POST)
    @ResponseStatus(code = HttpStatus.CREATED)
    public User save(@RequestBody final User user){
        return userService.save(user);

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.OK)
    public User find(@PathParam("username") String username){
        return userService.findByUsername(username);
    }

    @RequestMapping(value = "/", method=RequestMethod.PUT)
    @ResponseStatus(code=HttpStatus.OK)
    public void update(@RequestBody final User user){
        userService.update(user);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void delete(@PathParam("username") String username){
        userService.delete(username);
    }

    @RequestMapping(value="empty", method=RequestMethod.GET)
    public User getEmptyUser(){
        return new User();
    }
}
