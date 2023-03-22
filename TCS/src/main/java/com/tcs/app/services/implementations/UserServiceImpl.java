package com.tcs.app.services.implementations;

import java.util.*;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.app.entities.User;
import com.tcs.app.repositories.UserRepo;
import com.tcs.app.entities.EmailDetails;
import com.tcs.app.exceptions.ResourceNotFoundException;
import com.tcs.app.requests.UserRequest;
import com.tcs.app.services.EmailService;
import com.tcs.app.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private EmailService emailService;

	@Override
	public UserRequest createUser(UserRequest newUser) {
		User user = this.userRequestToUser(newUser);
		
		int min = 1;int max = 300;
		int code = (int)(Math.random()*(max-min+1)+min); 
		String idCode = String.valueOf(code);
		String memberId="BITS"+idCode;
		
		String info = "Hey! " +newUser.getName()+"\n\nThankyou for registering with us \n\n\n\nYour credentials - \n\nusername : "+newUser.getUsername()+" \n\npassword : "+ newUser.getPassword() +" \n\nmemberId : "+ memberId+" \n\n\n\nwe wish you to continue your journey with us";
		String subject = "Thank you for Registering with us !";
		EmailDetails details = new EmailDetails(newUser.getUsername(), info,subject,null);
		String result = this.emailService.sendSimpleMail(details);
		System.out.println(result);
		user.setUserId(memberId);
		System.out.println(memberId);
		User savedUser = this.userRepo.save(user);
		return this.userToUserRequest(savedUser);
		
	}

	@Override
	public UserRequest updateUser(UserRequest modifyUser, String userId) {
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User"," id ",userId));
		user.setName(modifyUser.getName());
		user.setUsername(modifyUser.getUsername());
		user.setMobileNumber(modifyUser.getMobileNumber());
		user.setPassword(modifyUser.getPassword());
		User updatedUser = this.userRepo.save(user);
		return this.userToUserRequest(updatedUser);
	}

	@Override
	public UserRequest getUserById(String userId) {
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User"," id ",userId));
		return this.userToUserRequest(user);
	}

	@Override
	public List<UserRequest> getAllUsers() {
		List<User> users = this.userRepo.findAll();
		List<UserRequest> usersList= users.stream().map(user->this.userToUserRequest(user)).collect(Collectors.toList());
		return usersList;
	}

	@Override
	public void deleteUser(String userId) {
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User"," id ",userId));
		this.userRepo.delete(user);
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
