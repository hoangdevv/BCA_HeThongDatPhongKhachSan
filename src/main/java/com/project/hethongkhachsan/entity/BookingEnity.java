package com.project.hethongkhachsan.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bookingsT")
public class BookingEnity extends BaseEntity {
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private UserEntity user;

	@ManyToOne()
	@JoinColumn(name = "room_id")
	private RoomEntity room;
	
	@ManyToOne()
	@JoinColumn(name = "booking_status_id")
	private BookingStatusEntity booking_status;
	
	@OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
	private List<PaymentEntity> payments  = new ArrayList<>();
	
	@Column
	private Date checkInDate;
	
	@Column
	private Date checkOutDate;
	
	@Column
	private BigDecimal totalPrice;
	
	@Column
	private Date createdDate;
	
	@Column
	private Date updatedDate;

	

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
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

	public RoomEntity getRoom() {
		return room;
	}

	public void setRoom(RoomEntity room) {
		this.room = room;
	}

	public BookingStatusEntity getBooking_status() {
		return booking_status;
	}

	public void setBooking_status(BookingStatusEntity booking_status) {
		this.booking_status = booking_status;
	}

	public List<PaymentEntity> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentEntity> payments) {
		this.payments = payments;
	}
	

	/*	public enum Status {
		PLACING, PAID, CANCELLED
	}*/
}
