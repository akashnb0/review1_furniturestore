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

import com.example.demo.model.Ratings;
import com.example.demo.service.RatingsService;



@RestController
public class RatingsController {
	@Autowired
	RatingsService ratser;
	@PostMapping("postx")
	public Ratings adding(@RequestBody Ratings o)
	{
		return ratser.saveinfo(o);
	}
	@GetMapping("getx")
	public List<Ratings> showing()
	{
		return ratser.showinfo();
	}
	
	//show by id
	@GetMapping("getbyidx/{id}")
	public Optional<Ratings> showid(@PathVariable int id)
	{
		return ratser.showbyid(id);
	}
	@PutMapping("putx")
	public Ratings modify(@RequestBody Ratings o)
	{
		return ratser.changeinfo(o);
	}
	//put by id
	@PutMapping("putbyidx/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Ratings o)
	{
		return ratser.updateinfobyid(id, o);
	}
	@DeleteMapping("delidx/{id}")
	public void deletemyid(@PathVariable int id)
	{
		ratser.deleteid(id);
	}
}
