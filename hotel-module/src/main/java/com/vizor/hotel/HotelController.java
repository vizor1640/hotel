package com.vizor.hotel;

import static com.vizor.hotel.JsonUtil.json;
import static spark.Spark.*;

public class HotelController {
    private HotelService hotelService = new HotelService();

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
