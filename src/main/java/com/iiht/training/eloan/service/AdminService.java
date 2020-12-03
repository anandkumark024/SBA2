package com.iiht.training.eloan.service;

import java.util.List;

import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Users;

public interface AdminService {

	
	public UserDto registerClerk(UserDto userDto);
		
	public UserDto registerManager(UserDto userDto);
	
	public List<UserDto> getAllClerks();
		
	public List<UserDto> getAllManagers();
	
	
}
