package com.example.mailzone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.mailzone.dto.EmailRequest;
import com.example.mailzone.service.EmailService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/sendNotification")
    public ResponseEntity<ApiResponse> sendNotification(
            @Valid @RequestBody EmailRequest request) {

        emailService.sendMail(request);

        return ResponseEntity.ok(
                new ApiResponse("SUCCESS", "Email sent successfully")
        );
    }

    // Simple response DTO
    static class ApiResponse {
        private final String status;
        private final String message;

        public ApiResponse(String status, String message) {
            this.status = status;
            this.message = message;
        }

        public String getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }
    }
}
