package com.spring.keycloak.service;

import com.spring.keycloak.model.Employee;

import java.util.List;

public interface EmployeeService {

    String saveUser();
    List<Employee> getAllEmployee();
}
