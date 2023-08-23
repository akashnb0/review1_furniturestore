
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ratings;
import com.example.demo.repository.RatingsRepo;

@Service
public class RatingsService {
	@Autowired
	RatingsRepo r;
	public Ratings saveinfo(Ratings o)
	{
		return r.save(o);
	}
	public List<Ratings> savedetails(List<Ratings> o)
	{
		return (List<Ratings>) r.saveAll(o);
	}
	public List<Ratings> showinfo()
	{
		return r.findAll();
	}
	//get by id
	public Optional<Ratings> showbyid(int id)
	{
		return r.findById(id);
	}
	
	public Ratings changeinfo(Ratings o)
	{
		return r.saveAndFlush(o);
	}
	//put by id
	public String updateinfobyid(int id, Ratings o)
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
