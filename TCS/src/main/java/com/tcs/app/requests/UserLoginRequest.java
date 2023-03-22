package com.tcs.app.requests;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class UserLoginRequest {
	private String  username;
	private String password;
}
