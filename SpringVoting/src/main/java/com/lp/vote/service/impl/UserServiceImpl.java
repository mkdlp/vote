package com.lp.vote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.vote.entity.User;
import com.lp.vote.mapper.UserMapper;
import com.lp.vote.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public User login(User user) {
		return userMapper.getUserByUser(user);
	}

}
