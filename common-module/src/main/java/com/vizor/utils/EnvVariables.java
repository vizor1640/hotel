package com.vizor.utils;

import java.util.Map;
import java.util.Optional;

public class EnvVariables {

    public static Optional<String> getEnv(final String key) {
        Map<String, String> env = System.getenv();
        return Optional.of(env.get(key));
    }
}
