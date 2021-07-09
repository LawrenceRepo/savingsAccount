package bank.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.model.WithdrawDetails;
import bank.repository.DepositRepository;
import bank.repository.WithdrawRepository;
import bank.service.WithdrawService;

@Service
public class WithdrawServiceImpl implements WithdrawService
	{
		private static final Logger	logger	= LoggerFactory.getLogger(WithdrawServiceImpl.class);
		
		@Autowired
		private WithdrawRepository	withdrawRepository;
		
		@Autowired
		private DepositRepository		depositRepository;
		
		@Override
		public String withdrawMoney(WithdrawDetails withdrawDetails)
			{
				
				logger.info("Going to withdraw Money by details : {}", withdrawDetails);
				
				String msg = "Sucessfully withdraw Money";
				try
					{
						Long depositMoney = depositRepository.getDepositMoneyByUserName(withdrawDetails.getUsername());
						
						if (depositMoney < withdrawDetails.getWithdrawAmount())
							{
								
								return "You can only withraw your limit " + depositMoney;
							}
						
							
						withdrawRepository.save(withdrawDetails);
					}
				catch (Exception e)
					{
						logger.error("Error while withdraw Money, err msg : {}", e.getMessage());
						msg = "Something went wrong";
					}
					
				return msg;
				
			}
			
	}
