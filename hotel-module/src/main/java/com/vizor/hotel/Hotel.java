package com.vizor.hotel;

import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

public class Hotel {
    final private int id;
    final private String name;
    final private CopyOnWriteArrayList<HotelLocation> hotelLocations = new CopyOnWriteArrayList<>();

    public Hotel(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public boolean addHotelLocation(Optional<HotelLocation<Hotel>> hotelLocation) {
        if(!hotelLocation.isPresent()) {
            return false;
        }

        hotelLocations.add(hotelLocation.get());
        return true;
    }

    public CopyOnWriteArrayList<HotelLocation> getHotelLocations() {
        return hotelLocations;
    }
}
