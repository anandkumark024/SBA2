package com.iiht.training.eloan.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.LoanOutputDto;

import com.iiht.training.eloan.dto.ProcessingDto;
import com.iiht.training.eloan.repository.LoanRepository;
import com.iiht.training.eloan.repository.ProcessingInfoRepository;
import com.iiht.training.eloan.repository.SanctionInfoRepository;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.ClerkService;

@Service
public class ClerkServiceImpl implements ClerkService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private ProcessingDto ProcessingDto;
	
	@Autowired
	private SanctionInfoRepository sanctionInfoRepository;
	
	@Override
	public List<LoanOutputDto> allAppliedLoans() {
		
		return loanRepository.findAll();
	}
	@Transactional
	@Override
	public ProcessingDto processLoan(Long clerkId, Long loanAppId, ProcessingDto processingDto) {
		if(loanAppId!=null) {
			if(loanRepository.existsById(loanAppId)) {
				throw new RuntimeException("loanAppId#"+ProcessingDto.getSuggestedAmountOfLoan()+" already exists");
			}
			
		}
		
		return processLoan(clerkId, loanAppId, processingDto);

}
}
