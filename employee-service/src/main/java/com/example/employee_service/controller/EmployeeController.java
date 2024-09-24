package com.example.employee_service.controller;

import com.example.employee_service.response.AddressResponse;
import com.example.employee_service.response.EmployeeResponse;
import com.example.employee_service.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees/{id}")
    private ResponseEntity<AddressResponse> getAddresseByIdEmployee(@PathVariable("id") int id) {
       return employeeService.getAddressEmployeeById(id);
    }
}
