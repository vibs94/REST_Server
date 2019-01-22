package com.javabycode.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="VB_HOTEL")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HOTEL_ID", nullable = false)
    private int hotelID;

    @NotNull
    @Column(name = "HOTEL_NAME", nullable = false)
    private String hotelName;

    @NotNull
    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @NotNull
    @Column(name = "CITY", nullable = false)
    private String city;

    @NotNull
    @Column(name = "COUNTRY", nullable = false)
    private String country;

    @NotNull
    @Column(name = "CURRENCY", nullable = false)
    private String currency;

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }
}
