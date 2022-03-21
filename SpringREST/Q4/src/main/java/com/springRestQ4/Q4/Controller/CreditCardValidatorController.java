package com.springRestQ4.Q4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springRestQ4.Q4.model.CreditCard;
import com.springRestQ4.Q4.service.CreditService;

@RestController
public class CreditCardValidatorController {
	
	@Autowired
	CreditService service;
	
	@RequestMapping(value="/validate", method=RequestMethod.PUT)
	public CreditCard validate(@RequestParam("credit_card") String card) {
		CreditCard check = service.validate(card);
		return check;
	}
	
	@RequestMapping("/check")
	public String checking() {
		String s = service.check();
		return s;
	}
	

}
