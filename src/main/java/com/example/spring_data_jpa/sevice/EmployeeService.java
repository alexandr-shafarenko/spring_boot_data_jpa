package com.example.spring_data_jpa.sevice;

import com.example.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployee(int empId);

    void deleteEmployee(int empId);

    List<Employee> findAllByName(String name);
}
