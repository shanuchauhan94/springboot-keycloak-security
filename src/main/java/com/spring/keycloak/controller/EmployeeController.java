package com.spring.keycloak.controller;

import com.spring.keycloak.model.Employee;
import com.spring.keycloak.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/app/keycloak")
public class EmployeeController {

    private final EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping("/save")
    @RolesAllowed("admin_role")
    public ResponseEntity<String> savedEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(service.saveUser(), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    @RolesAllowed({"user_role"})
    public ResponseEntity<List<Employee>> getEmployees() {
        return new ResponseEntity<>(service.getAllEmployee(), HttpStatus.OK);
    }
}
