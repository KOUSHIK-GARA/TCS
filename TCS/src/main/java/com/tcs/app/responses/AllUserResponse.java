package com.tcs.app.responses;

import java.util.List;

import com.tcs.app.requests.UserRequest;

public class AllUserResponse {
	private String code;
	private String status;
	private String message;
	private List<UserRequest> usersList;
}
