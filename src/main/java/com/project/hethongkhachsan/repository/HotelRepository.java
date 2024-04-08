package com.project.hethongkhachsan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hethongkhachsan.entity.HotelEntity;

public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
    
}