package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Insert("insert into tb_user (name,age) values (#{name},#{age})")
    public void save(User user);

    @Update("update tb_user set name = #{name},age =#{age} where id = #{id}")
    public void update(User user);

    @Delete("delete from tb_user where id = #{id}")
    public void delete(Long id);

    @Select("select * from tb_user")
    public List<User> findAll();

    @Select("select * from tb_user where id =#{id}")
    public User findOne(Long id);
}
