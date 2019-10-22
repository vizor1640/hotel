package com.vizor.hotel;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {

    @Test
    @DisplayName("Get Hotel Name")
    public void shouldGetHotelName() {
        final String HOTEL_YESKAMO = "Hotel YESKAMO";

        final Hotel hotel = new Hotel(1, HOTEL_YESKAMO);
        final String actualResult = hotel.getName();

        assertEquals(HOTEL_YESKAMO,  actualResult);
    }

    @Test
    @DisplayName("Return False If Hotel Name Is Null")
    public void shouldAddNullHotelLocationAndRTNFalse() {
        final String HOTEL_YESKAMO = "Hotel YESKAMO";

        final Hotel hotel = new Hotel(1,"HOTEL_YESKAMO");
        final boolean actualResult = hotel.addHotelLocation(Optional.empty());

        assertFalse(actualResult);
    }

    @Test
    public void shouldAddHotelLocationAndRTNTrue() {
        final String HOTEL_YESKAMO = "Hotel YESKAMO";
        final String name = "London";
        final String address = " Addr1, Addr2";

        final Hotel hotel = new Hotel(1,"HOTEL_YESKAMO");
        final HotelLocation<Hotel> hotelLocation = new HotelLocation<>(name, address);

        final boolean actualResult = hotel.addHotelLocation(Optional.of(hotelLocation));
        assertTrue(actualResult);
    }

    @Test
    public void shouldGetHotelLocations() {
        final String HOTEL_YESKAMO = "Hotel YESKAMO";
        final String name = "London";
        final String address = " Addr1, Addr2";

        final Hotel hotel = new Hotel(1,"HOTEL_YESKAMO");
        final HotelLocation<Hotel> hotelLocation = new HotelLocation<>(name, address);

        final boolean actualResult = hotel.addHotelLocation(Optional.of(hotelLocation));
        assertTrue(actualResult);

        final CopyOnWriteArrayList<HotelLocation> hotelLocations = hotel.getHotelLocations();
        assertEquals(hotelLocation, hotelLocations.get(0));
    }

//    @Test
//    public void shouldReturnTRUEIfHotelServiceDoesNotTimeout() throws Exception {
//        final String HOTEL_YESKAMO = "Hotel YESKAMO";
//
//        long ttl = 10000;
//        TimeLimiterConfig config = TimeLimiterConfig.custom().timeoutDuration(Duration.ofMillis(ttl)).build();
//        TimeLimiter timeLimiter = TimeLimiter.of(config);
//
//        Supplier<CompletableFuture<Boolean>> futureSupplier =
//                () -> CompletableFuture.supplyAsync(() -> new HotelService(new Hotel(HOTEL_YESKAMO)).run());
//
//        Callable<Boolean> executeFutureSupplier = TimeLimiter.decorateFutureSupplier(timeLimiter, futureSupplier);
//        assertThat(executeFutureSupplier.call(), equalTo(Boolean.TRUE));
//    }
}

