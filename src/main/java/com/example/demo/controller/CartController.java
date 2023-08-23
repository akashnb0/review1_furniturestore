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

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;



@RestController
public class CartController {
	@Autowired
	CartService cser;
	@PostMapping("postc")
	public Cart adding(@RequestBody Cart o)
	{
		return cser.saveinfo(o);
	}
	@GetMapping("getc")
	public List<Cart> showing()
	{
		return cser.showinfo();
	}
	
	//show by id
	@GetMapping("getbyidc/{id}")
	public Optional<Cart> showid(@PathVariable int id)
	{
		return cser.showbyid(id);
	}
	@PutMapping("putc")
	public Cart modify(@RequestBody Cart o)
	{
		return cser.changeinfo(o);
	}
	//put by id
	@PutMapping("putbyidc/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Cart o)
	{
		return cser.updateinfobyid(id, o);
	}
	@DeleteMapping("delidc/{id}")
	public void deletemyid(@PathVariable int id)
	{
		cser.deleteid(id);
	}
}
