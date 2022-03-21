package com.springRestQ7.Q7.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController {
	
	@Autowired
	private orderService orderService;
	
	@GetMapping("/orders")
	public List<Order> getAllorders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/orders/{id}")
	public Order getOrder(@PathVariable String id) {
		return orderService.getOrder(id);
	}
	
	@PostMapping("/orders/{id}")
	public void addOrder(@RequestBody Order order, @PathVariable String id) {
		orderService.addOrder(order);
	}
	
	@PutMapping("/orders/{id}")
	public void updateOrder(@RequestBody Order order,@PathVariable String id)
	{
		orderService.updateOrder(id,order);
	}
	
	@DeleteMapping("/orders/{id}")
	public void deleteOrder(@RequestBody Order order,@PathVariable String id)
	{
		orderService.deleteOrder(id,order);
	}

}