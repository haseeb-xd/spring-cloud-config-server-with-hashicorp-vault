package com.ansari.haseeb.demomicroservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchPropertyController {
    @Value("${demo.user}")
    private String user;

    @Value("${demo.password}")
    private String password;

    @GetMapping("/property")
    public ResponseEntity<String> fetchProperty() {
        return ResponseEntity.ok("User: "  + user + " Password: "+ password );
    }
}
