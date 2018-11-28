package com.oocl.web.sampleWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {
    private Service service;

    @Autowired
    public UserController(Service service) {
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<String> createUser(@RequestBody User user) {
        int userID = service.addUser(user);
        return ResponseEntity
                .created(URI.create("/users/" + userID))
                .body("User " + userID + " has been created");
    }
}
