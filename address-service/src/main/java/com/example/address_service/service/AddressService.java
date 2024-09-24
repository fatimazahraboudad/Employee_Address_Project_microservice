package com.example.address_service.service;

import com.example.address_service.entity.Address;
import com.example.address_service.mapper.AddressMapper;
import com.example.address_service.repository.AddressRepo;
import com.example.address_service.response.AddressResponse;
import org.springframework.stereotype.Service;

@Service
public class AddressService{

    private final AddressRepo addressRepo;

    public AddressService(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Address addressByEmployeeId = addressRepo.findByEmployeeId(employeeId);
        AddressResponse addressResponse = AddressMapper.mapper.addressResToAddress(addressByEmployeeId);
        return addressResponse;
    }
}
