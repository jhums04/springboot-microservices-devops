package com.book_service.book_service.utils;

import java.util.Arrays;

public class Utils {
    public static boolean hasNullProperties(Object obj) {
        return Arrays.stream(obj.getClass().getDeclaredFields())
                .filter(field -> !field.getName().equals("id"))
                .anyMatch(field -> {
                    boolean accessible = field.canAccess(obj);
                    try {
                        field.setAccessible(true);
                        return field.get(obj) == null;
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } finally {
                        field.setAccessible(accessible);
                    }
                });
    }
}
