package org.persimmon.cake.service;
/*
 * @time 2021/5/20 11:25
 * @author chy
 */

import org.persimmon.cake.mapper.UserMapper;
import org.persimmon.cake.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

//@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public Integer addSalary(User user) {
        user.setCreateDate(new Date());
        return userMapper.insertSelective(user);
    }
}
