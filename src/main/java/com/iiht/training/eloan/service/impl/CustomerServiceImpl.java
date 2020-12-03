package com.iiht.training.eloan.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.training.eloan.dto.LoanDto;
import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Loan;
import com.iiht.training.eloan.entity.ProcessingInfo;
import com.iiht.training.eloan.entity.Users;
import com.iiht.training.eloan.repository.LoanRepository;
import com.iiht.training.eloan.repository.ProcessingInfoRepository;
import com.iiht.training.eloan.repository.SanctionInfoRepository;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.CustomerService;


import net.bytebuddy.asm.Advice.This;



@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	
	@Autowired
	private LoanRepository loanRepository;
	
	
	@Autowired
	private ProcessingInfoRepository pProcessingInfoRepository;
	
	@Autowired
	private SanctionInfoRepository sanctionInfoRepository;
	
	
	@Override
	public UserDto register(UserDto userDto) {  
		
	if(userDto!=null) {
			if(usersRepository.existsById(userDto.getId())) {
				throw new RuntimeException("id#"+userDto.getId()+" already exists");
			}
			
		}
	userDto=usersRepository.save(userDto);
	//userDto=usersRepository.saveAll((Iterable<S>) userDto);
	
	
		return (userDto);
	}

	@Override
	public LoanOutputDto applyLoan(Long customerId, LoanDto loanDto) {
		if(!loanRepository.existsById(customerId))
				 {
			if(loanRepository.existsById(customerId)) {
				throw new RuntimeException("loanname"+loanDto.getLoanName()+" already exists");
			}
			
		}
		
		return applyLoan(customerId,loanDto);
	}



	@Override
	public LoanOutputDto getStatus(Long loanAppId)  throws RuntimeException {
		if(!loanRepository.existsById(loanAppId)) {
			throw new RuntimeException("loanAppId#"+loanAppId+" does not exists");
		}
		
		return loanRepository.findById(loanAppId).get();
	}
	

	@Override
	public List<LoanOutputDto> getStatusAll(Long customerId) {
		// TODO Auto-generated method stub
		return loanRepository.findAll();
	}


}
