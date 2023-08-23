package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Ratings;

public interface RatingsRepo extends JpaRepository<Ratings, Integer> {

}
