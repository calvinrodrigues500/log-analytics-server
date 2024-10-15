package com.calvin.log_analytics_server.controller;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webooks")
public class LogCollectorController {
    

    @PostMapping("/logs")
    public ResponseEntity<String> handleLogs(@RequestBody Map<String, Object> payload) {

        System.out.println("Received payload " + payload);

        return ResponseEntity.ok("Ok");
    }
}
