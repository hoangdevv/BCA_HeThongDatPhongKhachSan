package com.project.hethongkhachsan.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hethongkhachsan.dto.HotelDTO;
import com.project.hethongkhachsan.entity.HotelEntity;
import com.project.hethongkhachsan.repository.HotelRepository;
import com.project.hethongkhachsan.service.IHotelService;

@Service
public class HotelService implements IHotelService{
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public HotelDTO addHotel(HotelDTO hotelDTO) {
		 HotelEntity hotelEntity = new HotelEntity();
	        // Map các trường từ DTO sang entity
	        BeanUtils.copyProperties(hotelDTO, hotelEntity);

	        // Lưu khách sạn vào cơ sở dữ liệu
	        HotelEntity savedHotel = hotelRepository.save(hotelEntity);

	        // Tạo đối tượng HotelDTO từ entity đã lưu
	        HotelDTO savedHotelDTO = new HotelDTO();
	        BeanUtils.copyProperties(savedHotel, savedHotelDTO);
	        return savedHotelDTO;
	}

}
