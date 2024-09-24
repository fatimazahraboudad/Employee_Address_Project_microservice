package com.example.address_service.response;

import lombok.Data;

@Data
public class AddressResponse {
    private int id;
    private String city;
    private String state;
    private int employeeId;
}
