package com.example.employee_service.mapper;

import com.example.employee_service.entities.Employee;
import com.example.employee_service.response.EmployeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper mapper= Mappers.getMapper(EmployeeMapper.class);

    Employee employeeResToEmployee(EmployeeResponse employeeResponse);
    EmployeeResponse employeeToEmployeeRes(Employee employee);
}
