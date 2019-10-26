package com.vizor.utils;

import com.google.gson.Gson;
import spark.ResponseTransformer;

public class JsonUtil {

    public static String toJson(final Object object) {
        return new Gson().toJson(object);
    }

    public static <T> T fromJson(final String json, final Class<T> classOfT) {
        return new Gson().fromJson(json, classOfT);
    }

    public static ResponseTransformer json() {
        return JsonUtil::toJson;
    }
}