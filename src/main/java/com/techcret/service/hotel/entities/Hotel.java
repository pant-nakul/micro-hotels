package com.techcret.service.hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "micro_hotels")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hotel {

    @Id
    @Column(name = "id")
    private String hotelId;
    @Column(name = "name", length = 128)
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "about")
    private String about;

}
