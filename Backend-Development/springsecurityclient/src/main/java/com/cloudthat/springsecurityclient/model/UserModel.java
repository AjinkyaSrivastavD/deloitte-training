package com.cloudthat.springsecurityclient.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserModel {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String matchingPassword;
}
