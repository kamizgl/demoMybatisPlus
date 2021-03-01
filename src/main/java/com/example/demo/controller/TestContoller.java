package com.example.demo.controller;

import com.example.demo.entity.Girl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestContoller {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/huawei")
    public List<User> huawei() {
        List<User> userList = userMapper.selectList(null);
        return userList;

    }


    @RequestMapping("/like")
    public List<User> like(@Param("wxNickName") String wxNickName) {
        List<User> userList = userMapper.selectByName(wxNickName);
        return userList;

    }

    @RequestMapping("/insert")
    public void insert() {
        User user = new User();
        user.setId(2L);
        user.setAge(12);
        user.setName("chenli");
        user.setGirl(new Girl("zhou"));
        userMapper.insert(user);


    }
}
