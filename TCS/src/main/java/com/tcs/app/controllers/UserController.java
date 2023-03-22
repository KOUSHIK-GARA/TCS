package com.tcs.app.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tcs.app.requests.UserRequest;
import com.tcs.app.responses.AllUserResponse;
import com.tcs.app.responses.UserResponse;
import com.tcs.app.services.UserService;
import com.tcs.app.utils.TCSConstants;

@RestController
@RequestMapping("/api/users/v1")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<UserResponse> registerUser(@RequestBody UserRequest newUser){
//		UserRequest user = this.userService.createUser(newUser);
//	UserResponse response;
///		response.setCode(TCSConstants.CODE_OK);
//		response.setStatus(TCSConstants.STATUS_OK);
//	response.setMessage(TCSConstants.USER_CREATED_MSG);
//		response.setUser(user);
//		return ResponseEntity.created(response);
		return null;
	}
	
	@PutMapping("/updateUser/{userId}")
	public ResponseEntity<UserResponse> modifyUser(@RequestBody UserRequest changedUser, @PathVariable("userId")String uid){
//		UserRequest user = this.userService.updateUser(changedUser);
//		UserResponse response;
//		response.setCode(TCSConstants.CODE_CREATED);
//		response.setStatus(TCSConstants.STATUS_CREATED);
//		response.setMessage(TCSConstants.USER_UPDATED_MSG);
//		response.setUser(user);
//		return ResponseEntity.ok(response);
		return null;
	}
	
	@GetMapping("/getUser/{userId}")
	public ResponseEntity<UserResponse> obtainUser( @PathVariable("userId")String uid){
//		UserRequest user = this.userService.getUserById(uid);
//	UserResponse response;
//	response.setCode(TCSConstants.CODE_OK);
//		response.setStatus(TCSConstants.USER_FETCHED_MSG);
//		response.setMessage("User Fetched Successfully");
//		response.setUser(user);
//		return ResponseEntity.ok(response);
		return null;
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity<AllUserResponse> obtainAllUsers( ){
		List<UserRequest> usersList = this.userService.getAllUsers();
		AllUserResponse response;
//		response.setCode(TCSConstants.CODE_OK);
//		response.setStatus(TCSConstants.STATUS_OK);
//		response.setMessage(TCSConstants.ALL_USERS_FETCHED_MSG);
//		response.setUsersList(usersList);
//		return ResponseEntity.ok(response);		
		return null;
	}
	
	
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<UserResponse> removeUser( @PathVariable("userId")String uid){
//		 this.userService.deleteUser(uid);
//		UserResponse response;
//		response.setCode(TCSConstants.CODE_OK);
//		response.setStatus(TCSConstants.STATUS_OK);
//		response.setMessage(TCSConstants.USER_DELETED_MSG);
//		return ResponseEntity.ok(response);
		return null;
	}

}
