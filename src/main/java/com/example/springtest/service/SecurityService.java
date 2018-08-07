package com.example.springtest.service;

public interface SecurityService {
	
	 String findLoggedInUsername();

	 void autologin(String username, String password);

}
