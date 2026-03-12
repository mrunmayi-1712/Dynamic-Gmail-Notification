package com.example.mailzone.service;

import org.springframework.stereotype.Service;

import com.example.mailzone.dto.TbtAttendanceDto;

@Service
public class TbtService {

    public String processAttendance(TbtAttendanceDto dto) {
        // In a real app, you'd save to DB here. 
        // For practice, we print to the console.
        System.out.println("Processing TBT Attendance for: " + dto.getName());
        System.out.println("SAP No: " + dto.getSapNo());
        System.out.println("Department: " + dto.getDepartment());
        System.out.println("Contractor: " + dto.getContractor());
        return "Attendance recorded for " + dto.getName() + " successfully!";
    }
}