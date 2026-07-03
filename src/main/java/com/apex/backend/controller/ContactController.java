package com.apex.backend.controller;

import com.apex.backend.model.Contact;
import com.apex.backend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public ResponseEntity<Map<String, String>> submitContactForm(@RequestBody Contact contact) {
        contactRepository.save(contact);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Contact details saved successfully!");
        return ResponseEntity.ok(response);
    }
}
