package com.ereneren.springbootrestapi.controller;
;

public class ValueStorage {
    private String key;
    private int value;

    public ValueStorage(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}


