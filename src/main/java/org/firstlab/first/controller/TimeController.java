package org.firstlab.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TimeController {

    @GetMapping("/time")
    public Map<String, String> time() {
        return Map.of("time", ZonedDateTime.now().toString());
    }
}
