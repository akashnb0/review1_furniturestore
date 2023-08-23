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

import com.example.demo.model.Registration;
import com.example.demo.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationService regser;
	@PostMapping("post")
	public Registration adding(@RequestBody Registration o)
	{
		return regser.saveinfo(o);
	}
	@GetMapping("get")
	public List<Registration> showing()
	{
		return regser.showinfo();
	}
	
	//show by id
	@GetMapping("getbyid/{id}")
	public Optional<Registration> showid(@PathVariable int id)
	{
		return regser.showbyid(id);
	}
	@PutMapping("put")
	public Registration modify(@RequestBody Registration o)
	{
		return regser.changeinfo(o);
	}
	//put by id
	@PutMapping("putbyid/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Registration o)
	{
		return regser.updateinfobyid(id, o);
	}
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id)
	{
		regser.deleteid(id);
	}
}
