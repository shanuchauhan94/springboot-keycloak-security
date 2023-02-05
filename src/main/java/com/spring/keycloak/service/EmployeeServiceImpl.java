package com.spring.keycloak.service;

import com.spring.keycloak.model.Employee;
import com.spring.keycloak.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public String saveUser() {
        return repository.saveData();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return repository.getEmployees();
    }
}
