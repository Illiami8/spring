package com.cherepovski.Controller;

import com.cherepovski.model.Employee;
import com.cherepovski.model.Mentor;
import com.whitePages.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmplController {

    private final EmployeeRepository employeeRepository;

    @GetMapping("/api/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.getEmployees();
    }

    @GetMapping("/api/employees/alex")
    public Employee returnAlex() {
        return new Mentor(14, "Alex", 1000);
    }
}
