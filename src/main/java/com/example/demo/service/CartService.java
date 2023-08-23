
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepo;


@Service
public class CartService {
	@Autowired
	CartRepo r;
	public Cart saveinfo(Cart o)
	{
		return r.save(o);
	}
	public List<Cart> savedetails(List<Cart> o)
	{
		return (List<Cart>) r.saveAll(o);
	}
	public List<Cart> showinfo()
	{
		return r.findAll();
	}
	//get by id
	public Optional<Cart> showbyid(int id)
	{
		return r.findById(id);
	}
	
	public Cart changeinfo(Cart o)
	{
		return r.saveAndFlush(o);
	}
	//put by id
	public String updateinfobyid(int id, Cart o)
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
