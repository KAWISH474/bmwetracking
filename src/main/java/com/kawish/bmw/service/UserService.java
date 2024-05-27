package com.kawish.bmw.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.kawish.bmw.model.User;

@Service
public class UserService {

	private List<User> users= new ArrayList<>();

	public UserService() {
		users.add(new User(UUID.randomUUID().toString(),"Kawish","kawish@ymail.com"));
		users.add(new User(UUID.randomUUID().toString(),"Humaira","humaira@ymail.com"));
		users.add(new User(UUID.randomUUID().toString(),"Nihal","nihal@ymail.com"));
	}
	
	public List<User> getUsers(){
		return this.users;
	}
}
