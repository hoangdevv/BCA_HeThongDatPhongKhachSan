package com.project.hethongkhachsan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hotelsT")
public class HotelEntity extends BaseEntity {

	@Column
	private String name;

	@Column
	private String address;

	@Column
	private String city;

	@Column
	private String country;

	@Column
	private Double rating;

	@Column
	private String description;

	@Column
	private Date checkInTime;

	@Column
	private Date checkOutTime;

	@Column
	private Double latitude;

	@Column
	private Double longitude;
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	private List<RoomEntity> rooms  = new ArrayList<>();
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	private List<HotelImageEntity> hotelImages   = new ArrayList<>();
	
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	private List<ReviewEntity> reviews  = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}

	public Date getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(Date checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public List<RoomEntity> getRooms() {
		return rooms;
	}

	public void setRooms(List<RoomEntity> rooms) {
		this.rooms = rooms;
	}

	public List<HotelImageEntity> getHotelImages() {
		return hotelImages;
	}

	public void setHotelImages(List<HotelImageEntity> hotelImages) {
		this.hotelImages = hotelImages;
	}

	public List<ReviewEntity> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewEntity> reviews) {
		this.reviews = reviews;
	}
	

}
