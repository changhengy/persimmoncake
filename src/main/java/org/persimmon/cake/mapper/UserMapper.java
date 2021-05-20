package org.persimmon.cake.mapper;
/*
 * @time 2021/5/20 11:30
 * @author chy
 */

import org.persimmon.cake.model.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();

    int insert(User record);

    int insertSelective(User record);
}
