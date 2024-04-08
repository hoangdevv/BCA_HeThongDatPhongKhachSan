package com.project.hethongkhachsan.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usersT")
public class UserEntity extends BaseEntity {

	@Column(name = "username", nullable = false, unique = true)
	private String userName;

	@Column(nullable = false)
	private String password;

	@Column
	private String email;

	@Column(nullable = false)
	private String fullName;

	@Column
	private String phone;

	@Column
	private String address;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<BookingEnity> bookings = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<ReviewEntity> reviews  = new ArrayList<>();
	
	@ManyToOne()
	@JoinColumn(name = "role_id")
	private RoleEntity role;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	public List<BookingEnity> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingEnity> bookings) {
		this.bookings = bookings;
	}

	public List<ReviewEntity> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewEntity> reviews) {
		this.reviews = reviews;
	}
	
}
