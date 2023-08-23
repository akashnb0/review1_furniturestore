
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Registration;
import com.example.demo.repository.RegistrationRepo;

@Service
public class RegistrationService {
	@Autowired
	RegistrationRepo r;
	public Registration saveinfo(Registration o)
	{
		return r.save(o);
	}
	public List<Registration> savedetails(List<Registration> o)
	{
		return (List<Registration>) r.saveAll(o);
	}
	public List<Registration> showinfo()
	{
		return r.findAll();
	}
	//get by id
	public Optional<Registration> showbyid(int id)
	{
		return r.findById(id);
	}
	
	public Registration changeinfo(Registration o)
	{
		return r.saveAndFlush(o);
	}
	//put by id
	public String updateinfobyid(int id, Registration o)
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
