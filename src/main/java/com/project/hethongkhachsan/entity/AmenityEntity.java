package com.project.hethongkhachsan.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "amenitiesT")
public class AmenityEntity extends BaseEntity {

	@Column
	private String name;

	@Column
	private String description;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "amenity_room", joinColumns = @JoinColumn(name = "amenity_id"), inverseJoinColumns = @JoinColumn(name = "room_id"))
	private List<RoomEntity> rooms = new ArrayList<>();

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

	public List<RoomEntity> getRooms() {
		return rooms;
	}

	public void setRooms(List<RoomEntity> rooms) {
		this.rooms = rooms;
	}
	
	

}
