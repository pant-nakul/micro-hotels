package com.techcret.service.hotel.services;

import com.techcret.service.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //User operations
    //create
    Hotel saveHotel(Hotel user);

    List<Hotel> getAllHotels();

    Hotel getHotel(String hotelId);

    //TODO:Delete

    //TODO:Update

}
