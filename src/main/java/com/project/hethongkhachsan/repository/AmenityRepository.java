package com.project.hethongkhachsan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hethongkhachsan.entity.AmenityEntity;

public interface AmenityRepository extends JpaRepository<AmenityEntity, Long> {
    
}