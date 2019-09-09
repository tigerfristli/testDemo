package com.qs.dubbo.service;

import com.qs.dubbo.exterfacr.UserService;
import com.qs.dubbo.mapper.UserMapper;
import com.qs.dubbo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;





/**
 * 用户处理Service实现
 *
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

	/**注入数据操作的Mapper*/
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	/**
	 * 根据用户ID删除一个用户
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public int deleteUser(int id) {
		return userMapper.deleteUser(id);
	}

	/**
	 * 根据用户id查询用户信息
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 * @return
	 */
	@Override
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}

	/**
	 * 获取所有的用户信息
	 * 
	 * @return
	 */
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}
}
