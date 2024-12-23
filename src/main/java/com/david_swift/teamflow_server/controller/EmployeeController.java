package com.david_swift.teamflow_server.controller;

import com.david_swift.teamflow_server.model.Employee;
import com.david_swift.teamflow_server.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PagedModel;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/employees")
@CrossOrigin(origins="*", maxAge=3600)
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public ResponseEntity<Employee> registerEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<PagedModel<Employee>> getEmployees(@RequestParam(required = false) Integer pageNumber) {
        Page<Employee> page = employeeService.findEmployeesPageable(Objects.requireNonNullElse(pageNumber, 1));
        return ResponseEntity.ok(new PagedModel<>(page));
    }
}
