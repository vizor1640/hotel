package com.vizor.hotel;

import com.vizor.redis.Redis;

import static com.vizor.utils.JsonUtil.fromJson;

public class HotelService {
    private final int DATABASE = 0;
    private final Redis redis;

    public HotelService(final Redis redis) {
        this.redis = redis;
    }
    public Hotel getHotel(final int id) {
        final String hotelAsJson = redis.getByKey(DATABASE, id).get();
        return fromJson(hotelAsJson, Hotel.class);
    }

    public Boolean run() {
        return Boolean.TRUE;
    }
}
