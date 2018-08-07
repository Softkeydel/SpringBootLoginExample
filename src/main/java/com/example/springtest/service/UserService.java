package com.example.springtest.service;

import com.example.springtest.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
	