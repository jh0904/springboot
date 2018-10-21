package com.jh.springboot04restfulcrud.exception;

public class UserNotExistException extends RuntimeException {

	public UserNotExistException() {
		super ("用户不存在");
	}
}