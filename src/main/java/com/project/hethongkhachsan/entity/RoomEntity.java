package com.project.hethongkhachsan.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roomsT")
public class RoomEntity extends BaseEntity {

	@ManyToOne()
	@JoinColumn(name = "hotel_id")
	private HotelEntity hotel;

	@Column
	private BigDecimal pricePerNight;

	@Column
	private String description;

	@Column
	private Integer maxOccupancy;

	@Column
	private Boolean isAvailable;
	
	@ManyToOne()
	@JoinColumn(name = "type_id")
	private TypeEntity type;
	
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<BookingEnity> bookings  = new ArrayList<>();
	
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<RoomImageEntity> roomImages  = new ArrayList<>();
	
	@ManyToMany(mappedBy = "rooms")
	private List<AmenityEntity> amenities = new ArrayList<>();

	public BigDecimal getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(BigDecimal pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getMaxOccupancy() {
		return maxOccupancy;
	}

	public void setMaxOccupancy(Integer maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public HotelEntity getHotel() {
		return hotel;
	}

	public void setHotel(HotelEntity hotel) {
		this.hotel = hotel;
	}

	public TypeEntity getType() {
		return type;
	}

	public void setType(TypeEntity type) {
		this.type = type;
	}

	public List<BookingEnity> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingEnity> bookings) {
		this.bookings = bookings;
	}

	public List<RoomImageEntity> getRoomImages() {
		return roomImages;
	}

	public void setRoomImages(List<RoomImageEntity> roomImages) {
		this.roomImages = roomImages;
	}

	public List<AmenityEntity> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<AmenityEntity> amenities) {
		this.amenities = amenities;
	}
	

}
