package com.project.hethongkhachsan.dto;

import java.math.BigDecimal;
import java.util.List;

public class RoomDTO {
	private Long id;
	private BigDecimal pricePerNight;
	private String description;
	private Integer maxOccupancy;
	private Boolean isAvailable;
	private HotelDTO hotel;
	private TypeDTO type;
	private List<String> roomImages;
	private List<AmenityDTO> amenities;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public HotelDTO getHotel() {
		return hotel;
	}
	public void setHotel(HotelDTO hotel) {
		this.hotel = hotel;
	}
	public TypeDTO getType() {
		return type;
	}
	public void setType(TypeDTO type) {
		this.type = type;
	}
	public List<String> getRoomImages() {
		return roomImages;
	}
	public void setRoomImages(List<String> roomImages) {
		this.roomImages = roomImages;
	}
	public List<AmenityDTO> getAmenities() {
		return amenities;
	}
	public void setAmenities(List<AmenityDTO> amenities) {
		this.amenities = amenities;
	}
	
	
}
