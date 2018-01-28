package com.kshrd.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kshrd.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<User> getAllUsers() {
		return Arrays.asList(new User(1, "A"), new User(2, "B"));
	}

}
