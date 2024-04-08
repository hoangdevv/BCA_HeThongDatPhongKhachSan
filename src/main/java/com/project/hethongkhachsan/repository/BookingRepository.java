package com.project.hethongkhachsan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hethongkhachsan.entity.BookingEnity;

public interface BookingRepository extends JpaRepository<BookingEnity, Long> {
    
}