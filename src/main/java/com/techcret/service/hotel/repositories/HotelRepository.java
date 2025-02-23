package com.techcret.service.hotel.repositories;

import com.techcret.service.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
    //custom methods
}
