package com.ereneren.springbootrestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class MyController {

    // Burada değerler saklanıyor
    private HashMap<String, Integer> valueMap = new HashMap<>();

    public MyController() {
        // Örnek verileri ekleyin
        valueMap.put("AA", 1555);
        valueMap.put("BCD", 885);
        valueMap.put("ABC",162);
    }

    @GetMapping("/getValue")
    public ResponseEntity<?> getValue(@RequestParam String key) {
        if (valueMap.containsKey(key)) {
            return new ResponseEntity<>(valueMap.get(key), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Key not found", HttpStatus.NOT_FOUND);
        }
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}
