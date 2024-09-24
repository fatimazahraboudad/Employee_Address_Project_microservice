package com.example.employee_service.response;

import lombok.Data;

@Data
public class EmployeeResponse {

    private int id;
    private String name;
    private String email;
    private String age;
    private AddressResponse addressResponse;

}
