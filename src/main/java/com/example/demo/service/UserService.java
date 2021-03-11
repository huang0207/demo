package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;



public interface UserService {


    public List<User> findAll();

    public User findOne(Long id);

    public void delete(Long id);

    public void update(User user);

    public void save(User user);
}
