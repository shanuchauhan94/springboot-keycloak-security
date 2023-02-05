package com.spring.keycloak.repository;

import com.spring.keycloak.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class EmployeeRepository {

    public String saveData() {

        return "Employee with Id: " + UUID.randomUUID().toString() + " generated.";
    }

    public List<Employee> getEmployees() {
        return Arrays.asList(new Employee(UUID.randomUUID().toString(), "A", "a8@gmail.com"), new Employee(UUID.randomUUID().toString(), "B", "bn@gmail.com"));

    }

}
