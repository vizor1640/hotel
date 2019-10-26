package com.vizor.hotel;

import com.vizor.utils.JsonUtil;

public class Test {
    public static void main(String[] args) {
        String str = JsonUtil.toJson(new Hotel(1, "Test"));

        System.out.println(str);
    }
}
