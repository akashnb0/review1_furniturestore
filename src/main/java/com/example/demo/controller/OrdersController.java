package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Orders;
import com.example.demo.service.OrdersService;


@RestController
public class OrdersController {
	@Autowired
	OrdersService orser;
	@PostMapping("posto")
	public Orders adding(@RequestBody Orders o)
	{
		return orser.saveinfo(o);
	}
	@GetMapping("geto")
	public List<Orders> showing()
	{
		return orser.showinfo();
	}
	
	//show by id
	@GetMapping("getbyido/{id}")
	public Optional<Orders> showid(@PathVariable int id)
	{
		return orser.showbyid(id);
	}
	@PutMapping("puto")
	public Orders modify(@RequestBody Orders o)
	{
		return orser.changeinfo(o);
	}
	//put by id
	@PutMapping("putbyido/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Orders o)
	{
		return orser.updateinfobyid(id, o);
	}
	@DeleteMapping("delido/{id}")
	public void deletemyid(@PathVariable int id)
	{
		orser.deleteid(id);
	}
}
