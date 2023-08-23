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

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;



@RestController
public class PaymentController {
	@Autowired
	PaymentService yser;
	@PostMapping("posty")
	public Payment adding(@RequestBody Payment o)
	{
		return yser.saveinfo(o);
	}
	@GetMapping("gety")
	public List<Payment> showing()
	{
		return yser.showinfo();
	}
	
	//show by id
	@GetMapping("getbyidy/{id}")
	public Optional<Payment> showid(@PathVariable int id)
	{
		return yser.showbyid(id);
	}
	@PutMapping("puty")
	public Payment modify(@RequestBody Payment o)
	{
		return yser.changeinfo(o);
	}
	//put by id
	@PutMapping("putbyidy/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Payment o)
	{
		return yser.updateinfobyid(id, o);
	}
	@DeleteMapping("delidy/{id}")
	public void deletemyid(@PathVariable int id)
	{
		yser.deleteid(id);
	}
}
