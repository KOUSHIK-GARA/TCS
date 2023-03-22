package com.tcs.app.services;

import java.util.List;

import com.tcs.app.requests.UserRequest;

public interface UserService {
	
	UserRequest createUser(UserRequest newUser);
	UserRequest updateUser(UserRequest modifyUser, String userId);
	UserRequest getUserById(String userId);
	List<UserRequest> getAllUsers();
	void deleteUser(String userId);

}
