package com.vedannt.springExamples.springCore.components;

import org.springframework.stereotype.Component;

import com.vedannt.springExamples.springCore.models.Student;

/**
 * Created by vanchondo on 5/18/17.
 */
@Component
public class PrintComponent {

    private Student student;

    public PrintComponent(Student student){
        this.student = student;
    }

    public void printStudent(){
        System.out.println(student);
    }

}
