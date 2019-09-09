package com.qs.dubbo.mapper;

import com.qs.dubbo.model.User;

import java.util.List;

/**
 * @author TigerLi
 * @Version 1.0
 * 2019/9/5  15:54
 */
public interface UserMapper {

    public int addUser(User user);

    public int deleteUser(int id);

    public int updateUser(User user);

    public User getUserById(int id);

    public List<User> getAllUser();
}
