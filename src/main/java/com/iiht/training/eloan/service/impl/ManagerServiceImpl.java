package com.iiht.training.eloan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.dto.RejectDto;
import com.iiht.training.eloan.dto.SanctionDto;
import com.iiht.training.eloan.dto.SanctionOutputDto;
import com.iiht.training.eloan.repository.LoanRepository;
import com.iiht.training.eloan.repository.ProcessingInfoRepository;
import com.iiht.training.eloan.repository.SanctionInfoRepository;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private ProcessingInfoRepository pProcessingInfoRepository;
	
	@Autowired
	private SanctionInfoRepository sanctionInfoRepository;
	
	@Override
	public List<LoanOutputDto> allProcessedLoans() {
		return loanRepository.findAll();
	}

	@Override
	public RejectDto rejectLoan(Long managerId, Long loanAppId, RejectDto rejectDto) {
		if(loanAppId!=null) {			
			if(loanRepository.existsById(loanAppId)) {
				throw new RuntimeException("loanAppId#"+rejectDto.getRemark()+" is rejected");
			}
			
		}
		
		return rejectLoan(loanAppId, loanAppId, rejectDto) ;
		
	}

	@Override
	public SanctionOutputDto sanctionLoan(Long managerId, Long loanAppId, SanctionDto sanctionDto) {
		if(loanAppId!=null) {			
			if(loanRepository.existsById(loanAppId)) {
				throw new RuntimeException("loanAppId#"+sanctionDto.getLoanAmountSanctioned()+" is sancationed");
			}
			
		}
		
		return sanctionLoan(loanAppId, loanAppId, sanctionDto) ;
	}

}
