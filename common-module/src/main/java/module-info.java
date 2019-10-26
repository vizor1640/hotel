module common.module {
    requires jedis;
    requires spark.core;
    requires com.google.gson;

    exports com.vizor.redis;
    exports com.vizor.utils;
}

