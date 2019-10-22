package com.vizor.hotel;

public class HotelLocation<Hotel> {
    final private String name;
    final private String address;

    public HotelLocation(final String name, final String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
