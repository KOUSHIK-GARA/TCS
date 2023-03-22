package com.tcs.app.responses;

import com.tcs.app.requests.UserRequest;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class UserResponse {
	private String code;
	private String status;
	private String message;
	private UserRequest user;
}
