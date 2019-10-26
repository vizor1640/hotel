package com.vizor.hotel;

import com.vizor.redis.Redis;

import static com.vizor.utils.JsonUtil.json;
import static spark.Spark.get;

public class HotelController {
    private HotelService hotelService = new HotelService(Redis.INSTANCE);

    public HotelController() {
        get("/hotel/:id", (req, res) -> {
            int id = Integer.valueOf(req.params(":id"));
            Hotel hotel = hotelService.getHotel(id);
            return hotel;
        }, json());
    }

    public static void main(String[] args) {
        new HotelController();
    }
}
