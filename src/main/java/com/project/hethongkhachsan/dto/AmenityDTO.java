package com.project.hethongkhachsan.dto;

import java.util.List;

public class AmenityDTO {
	private Long id;
	private String name;
    private String description;
    private List<RoomDTO> rooms;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<RoomDTO> getRooms() {
		return rooms;
	}
	public void setRooms(List<RoomDTO> rooms) {
		this.rooms = rooms;
	}
    
    
}
