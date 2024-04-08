package com.project.hethongkhachsan.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "reviewsT")
public class ReviewEntity extends BaseEntity{
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@ManyToOne()
	@JoinColumn(name = "hotel_id")
	private HotelEntity hotel;
	
	@Column
	private Double rating;
	
	@Column
	private String comment;
	
	@Column
	private Date createdDate;
	
	@Column
	private Date updatedDate;

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public HotelEntity getHotel() {
		return hotel;
	}

	public void setHotel(HotelEntity hotel) {
		this.hotel = hotel;
	}
	
	
}
