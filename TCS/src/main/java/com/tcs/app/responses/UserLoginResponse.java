package com.tcs.app.responses;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
public class UserLoginResponse {
	private String code;
	private String status;
	private String message;
}
