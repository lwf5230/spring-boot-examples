package com.neo.model;

import java.io.Serializable;

import com.neo.enums.UserSexEnum;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String userName;
	private String passWord;
	private UserSexEnum userSex;
	private String nickName;

	public User() {
		super();
	}

	public User(String userName, String passWord, UserSexEnum userSex) {
		super();
		this.passWord = passWord;
		this.userName = userName;
		this.userSex = userSex;
	}

}