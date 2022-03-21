package com.springRestQ6.Q6.controller;

import java.lang.reflect.Array;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MathController {

	@Autowired
	RestTemplate template;
	@Autowired
	MathService service;
	
	@PostMapping("/consume/add")
	public String add(@RequestBody Maths ms) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Maths> entity = new HttpEntity<Maths>(ms,headers);
		return template.exchange("http://localhost:8080/add", HttpMethod.POST, entity, String.class).getBody();
	}
	
	@PostMapping("/add")
	public long check(@RequestBody Maths ms) {
		
		return service.add(ms.getN1(), ms.getN2());
	}
}
