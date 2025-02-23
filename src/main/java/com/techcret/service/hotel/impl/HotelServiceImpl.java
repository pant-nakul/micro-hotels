package com.techcret.service.hotel.impl;

import com.techcret.service.hotel.entities.Hotel;
import com.techcret.service.hotel.repositories.HotelRepository;
import com.techcret.service.hotel.services.HotelService;
import com.techcret.service.hotel.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;


    /**
     * @param hotel
     * @return
     */
    @Override
    public Hotel saveHotel(Hotel hotel) {
        hotel.setHotelId(UUID.randomUUID().toString());
        return hotelRepository.save(hotel);
    }

    /**
     * @return
     */
    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    /**
     * @param hotelId
     * @return
     */
    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel not found on server with id :- " + hotelId));
    }
}
