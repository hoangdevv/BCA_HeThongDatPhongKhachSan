package com.project.hethongkhachsan.dto;

import java.util.List;

public class TypeDTO {
	private Long id;
	private String name;
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
	public List<RoomDTO> getRooms() {
		return rooms;
	}
	public void setRooms(List<RoomDTO> rooms) {
		this.rooms = rooms;
	}
	
	
}
