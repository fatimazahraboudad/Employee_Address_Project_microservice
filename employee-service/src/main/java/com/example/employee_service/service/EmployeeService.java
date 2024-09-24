package com.example.employee_service.service;

import com.example.employee_service.entities.Employee;
import com.example.employee_service.feignclient.AddressClient;
import com.example.employee_service.mapper.EmployeeMapper;
import com.example.employee_service.repository.EmployeeRepo;
import com.example.employee_service.response.AddressResponse;
import com.example.employee_service.response.EmployeeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    private final AddressClient addressClient;

    public EmployeeService(EmployeeRepo employeeRepo, AddressClient addressClient) {
        this.employeeRepo = employeeRepo;
        this.addressClient = addressClient;
    }
    public EmployeeResponse getEmployeeById(int id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(()-> new RuntimeException("employee not found"));
        EmployeeResponse employeeResponse = EmployeeMapper.mapper.employeeToEmployeeRes(employee);
        return employeeResponse;
    }

    public ResponseEntity<AddressResponse> getAddressEmployeeById(int id) {
        return addressClient.getAddressByEmployeeId(id);
    }





}
