package com.iiht.training.eloan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Users;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public UserDto registerClerk(UserDto userDto) {		
		if(userDto.getId()=='2') 
		 {
			if(usersRepository.existsById(userDto.getId())) {
				throw new RuntimeException("id#"+userDto.getId()+" already exists");
			}
			
		}
		userDto=usersRepository.save(userDto);
		return userDto;
	}

	@Override
	public UserDto registerManager(UserDto userDto) {
		if(userDto.getId()=='3') 
		 {
			if(usersRepository.existsById(userDto.getId())) {
				throw new RuntimeException("id#"+userDto.getId()+" already exists");
			}
			
		}
		userDto=usersRepository.save(userDto);
		return userDto;
	}

	@Override
	public List<UserDto> getAllClerks() {
		
		return usersRepository.findAll();
	}

	@Override
	public List<UserDto> getAllManagers() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

}