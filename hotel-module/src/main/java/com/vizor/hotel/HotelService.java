package com.vizor.hotel;

public class HotelService {

    public Hotel getHotel(final int id) {
        return new Hotel(id, "Test");
    }

    public Boolean run() {
        return Boolean.TRUE;
    }
}
