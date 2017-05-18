package com.vedannt.springExamples.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vedannt.springExamples.springCore.components.PrintComponent;
import com.vedannt.springExamples.springCore.models.Student;

/**
 * Created by vanchondo on 5/18/17.
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    Student getStudent(){
        Student student = new Student();
        student.setId(10l);
        student.setName("Paco");
        student.setLastName("Perez");
        return student;
    }

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        PrintComponent component = context.getBean(PrintComponent.class);
        component.printStudent();
    }
}
