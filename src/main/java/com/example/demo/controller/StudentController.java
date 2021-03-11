package com.example.demo.controller;

import com.example.demo.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @RequestMapping(value = "findOne",method = RequestMethod.GET)
    public List message(){
        ArrayList list = new ArrayList();
        Student student = new Student("boy",19,"Tom");
        Student student2 = new Student("boy",19,"Jom");
        Student student3 = new Student("boy",19,"zhang");
        Student student4 = new Student("boy",19,"li");
        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        return list;
    }

}
