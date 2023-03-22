package com.tcs.app.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="users")
@NoArgsConstructor
@Getter
@Setter
public class User {
	@Id
	private String userId;
	private String name;
	private String  username;
	private String password;
	private String mobileNumber;
	private String role;
}
