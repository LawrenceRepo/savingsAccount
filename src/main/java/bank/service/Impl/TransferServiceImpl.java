package bank.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.model.DepositDetails;
import bank.model.TransferDetails;
import bank.repository.DepositRepository;
import bank.repository.TransferRepository;
import bank.service.TransferService;

@Service
public class TransferServiceImpl implements TransferService
	{
		private static final Logger	logger	= LoggerFactory.getLogger(TransferServiceImpl.class);
		
		@Autowired
		private TransferRepository	transferRepository;
		
		@Autowired
		private DepositRepository		depositRepository;
		
		@Override
		public String transferMoney(TransferDetails transferDetails)
			{
				
				logger.info("Going to transfer Money by details : {}", transferDetails);
				
				String msg = "Sucessfully transfer Money";
				try
					{
						Long depositMoney = depositRepository.getDepositMoneyByUserName(transferDetails.getSenderName());
						
						if (depositMoney < transferDetails.getAmount())
							{
								
								return "You can only transfer your limit " + depositMoney;
							}
							
						transferRepository.save(transferDetails);
					}
				catch (Exception e)
					{
						logger.error("Error while transfer Money, err msg : {}", e.getMessage());
						msg = "Something went wrong";
					}
					
				return msg;
				
			}
			
	}
