package bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bank.model.DepositDetails;
import bank.model.TransferDetails;
import bank.model.UserDetails;
import bank.model.WithdrawDetails;
import bank.service.DepositService;
import bank.service.TransferService;
import bank.service.UserService;
import bank.service.WithdrawService;

@RestController
@RequestMapping(path = "/bank")
public class BankController
	{
		private static final Logger	logger	= LoggerFactory.getLogger(BankController.class);
		
		@Autowired
		private UserService userService;
		
		@Autowired
		private DepositService depositService;
		
		@Autowired
		private WithdrawService withdrawService;
		
		@Autowired
		private TransferService transferService;
		
		// http://localhost:8088/bank/createaccount
		@RequestMapping(method = RequestMethod.POST, value = "/createaccount")
		public String createAccount(@RequestBody UserDetails userDetails) {
			logger.info("Going to create account by user details : {}", userDetails);
			return userService.createAccount(userDetails);
			
		}
		
		// http://localhost:8088/bank/depositmoney
		@RequestMapping(method = RequestMethod.POST, value = "/depositmoney")
		public String depositMoney(@RequestBody DepositDetails depositDetails) {
			logger.info("Going to deposit Money by  details : {}", depositDetails);
			return depositService.depositMoney(depositDetails);
			
		}
		
	// http://localhost:8088/bank/withdrawmoney
		@RequestMapping(method = RequestMethod.POST, value = "/withdrawmoney")
		public String withdrawMoney(@RequestBody WithdrawDetails withdrawDetails) {
			logger.info("Going to withdraw Money by  details : {}", withdrawDetails);
			return withdrawService.withdrawMoney(withdrawDetails);
			
		}
		
		
		// http://localhost:8088/bank/transfermoney
		@RequestMapping(method = RequestMethod.POST, value = "/transfermoney")
		public String transferMoney(@RequestBody TransferDetails transferDetails) {
			logger.info("Going to transfer Money by  details : {}", transferDetails);
			return transferService.transferMoney(transferDetails);
			
		}
		
		
	}


//1. Create savings accounts. 

//2. Deposit and withdraw money into these savings accounts. 



//3. Transfer money from one savings account to another savings account. 

//4. The account must not be overdrawn.






