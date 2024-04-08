package com.project.hethongkhachsan.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "typesT")
public class TypeEntity extends BaseEntity {

	@Column
	private String name;
	
	@OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
	private List<RoomEntity> rooms  = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RoomEntity> getRooms() {
		return rooms;
	}

	public void setRooms(List<RoomEntity> rooms) {
		this.rooms = rooms;
	}
	
	
}
