package com.project.hethongkhachsan.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "booking_statusesT")
public class BookingStatusEntity extends BaseEntity{
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "booking_status", cascade = CascadeType.ALL)
	private List<BookingEnity> bookings  = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BookingEnity> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingEnity> bookings) {
		this.bookings = bookings;
	}
	
	
}
