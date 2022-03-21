package com.springRestQ2.Q2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springRestQ2.Q2.model.CountryModel;

@RestController
public class CountryController {
	
	@GetMapping(value="/country/{zipcode}", headers="Accept=application/json")
	public CountryModel getCountryById(@PathVariable int zipcode) {
		System.out.println("getCountryById is working...");
		List<CountryModel> listOfCountries = new ArrayList();
		
		for(CountryModel country:listOfCountries) {
			if(country.getZipcode()==zipcode)
				return country;
		}
		return null;
	}
	
	@GetMapping("/getInfo")
	public CountryModel getCountry(@RequestParam("code") String zcode) {
		
		System.out.println("getCountry is working...");
		long zipcode=Integer.parseInt(zcode);
		List<CountryModel> listOfCountries= new ArrayList<CountryModel>();
		listOfCountries=createCountryList();
		
		for(CountryModel country:listOfCountries)
		{
			if(country.getZipcode()==zipcode)
				return country;
		}
		return null;
	}
	
	private List<CountryModel> createCountryList() {
		CountryModel m1 = new CountryModel(53694,"Maharashtra","Nagpur", "India");
		CountryModel m2 = new CountryModel(53689, "California","Los Angeles", "USA" );
		CountryModel m3 = new CountryModel(53675, "Headingly","Cambridge","London");
		CountryModel m4 = new CountryModel(53631, "South Australia","Brisbane","Australia" );
		CountryModel m5 = new CountryModel(53625, "Madhya Pradesh","Bhopal","India");
		
		 List<CountryModel> listOfCountries = new ArrayList();
	        listOfCountries.add(m1);
	        listOfCountries.add(m2);
	        listOfCountries.add(m3);
	        listOfCountries.add(m4);
	        listOfCountries.add(m5);
	        return listOfCountries;
	}

}
