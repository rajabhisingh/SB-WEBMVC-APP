package com.abhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.User;
import com.abhi.repo.UserRepository;
import com.abhi.utils.CryptoUtils;
import com.abhi.utils.EmailUtils;
import com.abhi.utils.PasswordUtils;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	
	private UserRepository userRepository;
	
	@Autowired
	private EmailUtils emailUtils;
	
	private CryptoUtils cryptoUtils;
	
	
	
	@Override
	public boolean saveUser(User user) {
		
//		 if (userRepository.findByEmail(user.getEmail()) != null) {
//	            // User with the same email already exists, return false to indicate failure
//	            return false;
//	        }
//		 
//		User savedUser = userRepository.save(user);
//		if(savedUser.getId()!=null) {
//			String subject = "Your Account Created - Ashok IT";
//			String body = "<h1>Congratulations, welcome to onboard..</h1>";
//			emailUtils.sendeEmail(user.getEmail(), subject, body);
//	} 
//		return true;
//	}
		

		 if (userRepository.findByEmail(user.getEmail()) != null) {
	            // User with the same email already exists, return false to indicate failure
	            return false;
	        }

	        // Generate a new password
	        String newPassword = PasswordUtils.generateNewPassword(8);

	        // Encrypt the password before saving to the database
	        try {
	            user.setPwd(CryptoUtils.encrypt(newPassword));
	        } catch (Exception e) {
	           e.printStackTrace();
	            // Handle encryption error
	            return false;
	        }

	        // Save the user to the database
	        User savedUser = userRepository.save(user);
	        if (savedUser.getId() != null) {
	            String subject = "Your Account Created - Ashok IT";
	            String body = "<h1>Congratulations, welcome to onboard..</h1>";
	            emailUtils.sendeEmail(user.getEmail(), subject, body);
	            return true;
	        }
	        return false;
	    }

	    
	


	
	@Override
	public User getUser(String email, String pwd) {
	    User user = userRepository.findByEmail(email);
	   
		return user;
}


@Override
	public boolean resetPassword(String email) {
		User user = userRepository.findByEmail(email);
		
		if(user!=null) {
		String newPassword = PasswordUtils.generateNewPassword(8);
		try{
		user.setPwd(CryptoUtils.encrypt(newPassword));
		userRepository.save(user);
		
		String subject = "Password Reset Request";
		String body = "Your new Password is:" +newPassword;
		emailUtils.sendeEmail(user.getEmail(), subject, body);
		return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		return false;
	}
		


	


}
