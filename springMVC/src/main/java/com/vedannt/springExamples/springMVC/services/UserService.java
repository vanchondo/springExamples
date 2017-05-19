package com.vedannt.springExamples.springMVC.services;

import org.springframework.stereotype.Service;

import com.vedannt.springExamples.springMVC.models.User;

/**
 * Created by vanchondo on 5/18/17.
 */
@Service
public class UserService {
    public User save(final User user) {
        System.out.println("Saving " + user);
        return user;
    }

    public User findByUsername(final String username) {
        System.out.println("Finding " + username);
        User user = new User();
        user.setUsername(username);
        return user;
    }

    public void update(final User user) {
        System.out.println("Updating " + user);
    }

    public void delete(final String username) {
        System.out.println("Deleting " + username);

    }

}

