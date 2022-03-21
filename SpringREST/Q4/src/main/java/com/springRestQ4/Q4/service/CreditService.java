package com.springRestQ4.Q4.service;

import org.springframework.stereotype.Service;

import com.springRestQ4.Q4.model.CreditCard;

@Service
public class CreditService {
	
	private CreditCard card1 = new CreditCard();
	
	public CreditCard validate(String number) {
		
		if(number.length() == 15) {
			//for JCB card
			card1.setType("JCB");
			card1.setValid(true);
		}
		else if(number.length() <=19 && number.length() >= 16) {
			//for Master and Visa
			if(number.length()==16) {
				card1.setType("Visa");
				card1.setValid(true);
			}
			card1.setType("MasterCard");
			card1.setValid(true);
		}
		return card1;
	}
	public String check() {
		return "Working Fine..";
	}
}
