package com.david_swift.teamflow_server.service;

import com.david_swift.teamflow_server.model.Employee;
import com.david_swift.teamflow_server.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {
    public static final int PAGE_SIZE = 10;
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Page<Employee> findEmployeesPageable(int pageNumber) {
        Pageable pageable = Pageable.ofSize(PAGE_SIZE).withPage(pageNumber);
        return employeeRepository.findAll(pageable);
    }

}

