package com.springRestQ3.Q3.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.springRestQ3.Q3.model.UserModel;

@RestController
public class AuthenticationController {
	
	@GetMapping("/auth")
	public String userAuth(@ModelAttribute("userModel1") UserModel userModel1) {
		
		boolean isValid = check(userModel1.getUsername(),userModel1.getPassword());
		
		if(isValid) {
			return "Valid User";
		}
		else {
			return "Invalid User";
		}
	}

	private boolean check(String username, String password) {
		if(username.contentEquals("Sameer") && password.contentEquals("1234")) {
			return true;
		}
		else {
		return false;
	}
		
	}

}
