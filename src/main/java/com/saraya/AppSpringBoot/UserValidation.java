package com.saraya.AppSpringBoot;

import org.springframework.stereotype.Service;

@Service
public class UserValidation {
	

	public boolean isValid(String username,String password) {
		
		if(username.equalsIgnoreCase("laye") && password.equalsIgnoreCase("ndiaye")) {
			
			return true;
			
		}else {
			
			return false;
		}
	}

}


