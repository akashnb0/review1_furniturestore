package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ratings_page")
public class Ratings {
	@Id
	private int ratingId;
	private int customerId;
	private int productId;
	private int stars;
	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ratings(int ratingId, int customerId, int productId, int stars) {
		super();
		this.ratingId = ratingId;
		this.customerId = customerId;
		this.productId = productId;
		this.stars = stars;
	}
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
}
