package com.gentech.employee.service;

import com.gentech.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getEmployees();
    EmployeeDto getEmployee(Long id);
    EmployeeDto modifyEmployee(Long id, EmployeeDto employeeDto);
    boolean deleteEmployee(Long id);

    List<EmployeeDto> getEmployeesByName(String name);

    List<EmployeeDto> getEmployeesByCityNameAndCountryName(String city,String country);

    List<EmployeeDto> getEmployeesBySalary(Integer salary);

    List<EmployeeDto> getEmployeesByJobNameKeyword(String jobkeyword, String columnName);

    List<EmployeeDto> getAllEmployees(Integer pageNumber, Integer pageSize);

    List<EmployeeDto> getEmployeesByJobNameOrCountryName(String jobName, String countryName);

    Integer deleteEmployeesByCityName(String cityName);

    Integer updateEmployeesByJobName(String countryName,String jobName);
}
