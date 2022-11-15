package com.whitePages;

import com.cherepovski.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class EmployeeRepository {
    private final Employee alex;
    public List<Employee> getEmployees(){
        return List.of(alex);
    }
}
