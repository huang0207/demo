package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/findOne/{id}")
    public User findOne(@PathVariable("id") Long id){
        return userService.findOne(id);
    }

    @PostMapping("/save")
    public String save(User user){
        userService.save(user);
        return "add Success";
    }

    @PutMapping("")
    public String update(User user){
        userService.update(user);
        return "update Success";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id")Long id){
        userService.delete(id);
        return "delete Success";
    }
}
