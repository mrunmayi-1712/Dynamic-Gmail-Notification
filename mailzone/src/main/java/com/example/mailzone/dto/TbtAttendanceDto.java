package com.example.mailzone.dto; // Adjust package to match your project

public class TbtAttendanceDto {
    private String name;
    private String sapNo;      // For "SAP No."
    private String department;  // For "Department"
    private String contractor;  // For "Contractor"

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSapNo() {
        return sapNo;
    }

    public void setSapNo(String sapNo) {
        this.sapNo = sapNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }
}