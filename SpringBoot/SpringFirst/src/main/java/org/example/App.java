package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring XML Configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");

        // Get Student bean
        Student student = (Student) context.getBean("Student");
        student.internshipProgram();
        // Get SpringBoot bean
        SpringBoot springBoot = (SpringBoot) context.getBean("SpringBoot");
        springBoot.show();
    }
}
