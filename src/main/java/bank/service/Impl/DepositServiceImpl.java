package bank.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.model.DepositDetails;
import bank.repository.DepositRepository;
import bank.service.DepositService;

@Service
public class DepositServiceImpl implements DepositService
	{
		private static final Logger	logger	= LoggerFactory.getLogger(DepositServiceImpl.class);
		
		
		@Autowired
		private DepositRepository depositRepository;
		
		@Override
		public String depositMoney(DepositDetails depositDetails) {
			
		
			logger.info("Going to deposit Money by details : {}", depositDetails);
			
			String msg = "Sucessfully deposit Money";
			try
				{
					depositRepository.save(depositDetails);
				}
			catch (Exception e)
				{
					logger.error("Error while deposit Money, err msg : {}", e.getMessage());
					msg = "Something went wrong";
				}
			
			
			
			return msg;
			
		}
		
		
	}
