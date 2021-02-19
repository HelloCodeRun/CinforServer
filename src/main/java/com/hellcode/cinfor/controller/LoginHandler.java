package com.hellcode.cinfor.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginHandler {
    @PostMapping(value = "/login", produces = "application/json")
    public Map<String, Object> login(@RequestBody Map<String, Object> loginInfor) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("username", loginInfor.get("username"));
        map.put("password", loginInfor.get("password"));
        return map;
    }
}
