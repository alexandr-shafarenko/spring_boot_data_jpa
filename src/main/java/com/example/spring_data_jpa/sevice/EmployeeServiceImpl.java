package com.example.spring_data_jpa.sevice;

import com.example.spring_data_jpa.dao.EmployeeRepository;
import com.example.spring_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int empId) {
        Employee employee = null;
        Optional<Employee> optionalEmployee = employeeRepository.findById(empId);
        if (optionalEmployee.isPresent()) {
            employee = optionalEmployee.get();
        }
        return employee;
    }

    @Override
    public void deleteEmployee(int empId) {
        employeeRepository.deleteById(empId);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employees = employeeRepository.findAllByName(name);
        return employees;
    }

}
