package com.study.security.service;

import java.util.List;
import java.util.Optional;

import com.study.security.model.User;

public interface IUserService {

	void createUser(User user);
	List<User> getAllUsers();
	Optional<User> getOneUser(Integer Id);
}
