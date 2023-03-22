package com.tcs.app.services.implementations;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.app.entities.User;
import com.tcs.app.requests.UserRequest;
import com.tcs.app.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserRequest createUser(UserRequest newUser) {
		
		return null;
	}

	@Override
	public UserRequest updateUser(UserRequest modifyUser, String userId) {
//		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User"," id ",userId));
//		user.setName(modifyUser.getName());
//		user.setUsername(modifyUser.getUsername());
//		user.setMobileNumber(modifyUser.getMobileNumber());
//		user.setPassword(modifyUser.getPassword());
//		User updatedUser = this.userRepo.save(user);
//		return this.userToUserRequest(updatedUser);
		return null;
	}

	@Override
	public UserRequest getUserById(String userId) {
//		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User"," id ",userId));
//		return this.userToUserRequest(user);
		return null;
	}

	@Override
	public List<UserRequest> getAllUsers() {
//		List<User> users = this.userRepo.findAll();
//		List<UserRequest> usersList= users.stream().map(user->this.userToUserRequest(user)).collect(Collectors.toList());
//		return usersList;
		return null;
	}

	@Override
	public void deleteUser(String userId) {
//		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User"," id ",userId));
//		this.userRepo.delete(user);

	}
	
	
	/* Utility Methods*/
	
	
	public User userRequestToUser(UserRequest userRequest) {
		User user = this.modelMapper.map(userRequest,User.class);
		return user;
	}
	
	public UserRequest userToUserRequest(User user) {
		UserRequest userRequest = this.modelMapper.map(user,UserRequest.class);
		return userRequest;
	}
	
	
	
	
	
	

}
