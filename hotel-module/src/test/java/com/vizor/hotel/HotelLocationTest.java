package com.vizor.hotel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotelLocationTest {

    @Test
    @DisplayName("Add Hotel Location")
    public void shouldAddHotelLocation() {
        final String name = "London";
        final String address = " Addr1, Addr2";
        final HotelLocation<Hotel> hotelLocation = new HotelLocation<>(name, address);

        assertAll("Create and verify HotelLocation details", () -> assertEquals(name, hotelLocation.getName()), () -> assertEquals(address, hotelLocation.getAddress()));
    }
}
