package com.qs.dubbo.exterfacr;

import com.qs.dubbo.model.User;

import java.util.List;

/**
 * @author TigerLi
 * @Version 1.0
 * 2019/9/5  14:57
 */
public interface UserService {

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 根据用户ID删除一个用户
     *
     * @param id
     * @return
     */
    public int deleteUser(int id);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    public int updateUser(User user);

    /**
     * 根据用户id查询用户信息
     *
     * @param id
     * @return
     */
    public User getUserById(int id);

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    public List<User> getAllUser();
}
