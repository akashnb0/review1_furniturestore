
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Orders;
import com.example.demo.repository.OrdersRepo;


@Service
public class OrdersService {
	@Autowired
	OrdersRepo r;
	public Orders saveinfo(Orders o)
	{
		return r.save(o);
	}
	public List<Orders> savedetails(List<Orders> o)
	{
		return (List<Orders>) r.saveAll(o);
	}
	public List<Orders> showinfo()
	{
		return r.findAll();
	}
	//get by id
	public Optional<Orders> showbyid(int id)
	{
		return r.findById(id);
	}
	
	public Orders changeinfo(Orders o)
	{
		return r.saveAndFlush(o);
	}
	//put by id
	public String updateinfobyid(int id, Orders o)
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
