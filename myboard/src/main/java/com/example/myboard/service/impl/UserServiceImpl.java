package com.example.myboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myboard.model.User;
import com.example.myboard.repository.UserReposistory;
import com.example.myboard.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserReposistory user;

	public UserServiceImpl(UserReposistory user) {
		super();
		this.user = user;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return user.findAll();			// 상속받은 인터페이스의 함수를 오버라이딩
	}
	
	
	
}
