package com.example.myboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return user.findById(id).get();
	}

	@Override
	public User saveUser(User user) {			// 새로 저장하기
		// TODO Auto-generated method stub
		return this.user.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return this.user.save(user);
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		user.deleteById(id);
	}

	@Override
	public Page<User> findPaginated(int no, int totalNo) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(no, totalNo);
		return user.findAll(pageable);
	}
	
	
	
}
