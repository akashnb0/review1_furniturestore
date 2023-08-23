
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepo;

@Service
public class ProductsService {
	@Autowired
	ProductsRepo r;
	public Products saveinfo(Products o)
	{
		return r.save(o);
	}
	public List<Products> savedetails(List<Products> o)
	{
		return (List<Products>) r.saveAll(o);
	}
	public List<Products> showinfo()
	{
		return r.findAll();
	}
	//get by id
	public Optional<Products> showbyid(int id)
	{
		return r.findById(id);
	}
	
	public Products changeinfo(Products o)
	{
		return r.saveAndFlush(o);
	}
	//put by id
	public String updateinfobyid(int id, Products o)
	{
		r.saveAndFlush(o);
		if(r.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	//delete by id
	public void deleteid(int id)
	{
		r.deleteById(id);
	}
}
