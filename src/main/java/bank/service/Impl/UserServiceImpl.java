package bank.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.model.UserDetails;
import bank.repository.UserRepository;
import bank.service.UserService;

@Service
public class UserServiceImpl implements UserService
	{
		private static final Logger	logger	= LoggerFactory.getLogger(UserServiceImpl.class);
		
		@Autowired
		private UserRepository userRepository;
		
		
		@Override
		public String createAccount(UserDetails userDetails) {
			
			logger.info("Going to create Account with UserDetails : {}", userDetails);
			
			String msg = "Sucessfully Bank Account Created";
			try
				{
					userRepository.save(userDetails);
				}
			catch (Exception e)
				{
					logger.error("Error while creating Account, err msg : {}", e.getMessage());
					msg = "Something went wrong";
				}
			
			
			
			return msg;
			
		}
		
		
	}
