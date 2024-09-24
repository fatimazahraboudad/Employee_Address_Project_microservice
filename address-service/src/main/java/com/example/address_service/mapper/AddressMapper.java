package com.example.address_service.mapper;

import com.example.address_service.entity.Address;
import com.example.address_service.response.AddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper mapper = Mappers.getMapper(AddressMapper.class);
    Address addressToAddressResp(AddressResponse addressResponse);

    AddressResponse addressResToAddress(Address address);
}
