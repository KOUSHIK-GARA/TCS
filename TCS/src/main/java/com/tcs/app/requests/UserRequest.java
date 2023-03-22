package com.tcs.app.requests;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class UserRequest {
	private String name;
	private String  username;
	private String password;
	private String mobileNumber;
	private String role;
}
