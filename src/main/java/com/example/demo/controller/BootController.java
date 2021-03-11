package com.example.demo.controller;


import com.example.demo.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @RequestMapping(value = "/boot",method = RequestMethod.GET)
    public String say(){
        Student student = new Student();
        return "我是你爸爸";
    }

}
