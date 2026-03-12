package com.example.mailzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mailzone.dto.TbtAttendanceDto;
import com.example.mailzone.service.TbtService;

@RestController
@RequestMapping("/api/tbt")
public class TbtController {

    @Autowired
    private TbtService tbtService;

    @PostMapping("/submit")
    public String submitAttendance(@RequestBody TbtAttendanceDto attendanceDto) {
        return tbtService.processAttendance(attendanceDto);
    }
}