package com.project.hethongkhachsan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hethongkhachsan.dto.HotelDTO;
import com.project.hethongkhachsan.service.IHotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private IHotelService hotelService;

    @PostMapping(value = "/add")
    public ResponseEntity<HotelDTO> addHotel(@RequestBody HotelDTO hotelDTO) {
        HotelDTO addedHotel = hotelService.addHotel(hotelDTO);
        return new ResponseEntity<>(addedHotel, HttpStatus.CREATED);
    }
}