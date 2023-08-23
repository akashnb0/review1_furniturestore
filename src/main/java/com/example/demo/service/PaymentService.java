
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;
import com.example.demo.repository.PaymentRepo;

@Service
public class PaymentService {
	@Autowired
	PaymentRepo r;
	public Payment saveinfo(Payment o)
	{
		return r.save(o);
	}
	public List<Payment> savedetails(List<Payment> o)
	{
		return (List<Payment>) r.saveAll(o);
	}
	public List<Payment> showinfo()
	{
		return r.findAll();
	}
	//get by id
	public Optional<Payment> showbyid(int id)
	{
		return r.findById(id);
	}
	
	public Payment changeinfo(Payment o)
	{
		return r.saveAndFlush(o);
	}
	//put by id
	public String updateinfobyid(int id, Payment o)
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
