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

import com.example.demo.model.Products;
import com.example.demo.service.ProductsService;

@RestController
public class ProductsController {
	@Autowired
	ProductsService regser;
	@PostMapping("postp")
	public Products adding(@RequestBody Products o)
	{
		return regser.saveinfo(o);
	}
	@GetMapping("getp")
	public List<Products> showing()
	{
		return regser.showinfo();
	}
	
	//show by id
	@GetMapping("getbyidp/{id}")
	public Optional<Products> showid(@PathVariable int id)
	{
		return regser.showbyid(id);
	}
	@PutMapping("putp")
	public Products modify(@RequestBody Products o)
	{
		return regser.changeinfo(o);
	}
	//put by id
	@PutMapping("putbyidp/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Products o)
	{
		return regser.updateinfobyid(id, o);
	}
	@DeleteMapping("delidp/{id}")
	public void deletemyid(@PathVariable int id)
	{
		regser.deleteid(id);
	}
}
