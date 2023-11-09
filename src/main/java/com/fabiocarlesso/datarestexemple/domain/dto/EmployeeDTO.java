package com.fabiocarlesso.datarestexemple.domain.dto;

import com.fabiocarlesso.datarestexemple.domain.entities.Employee;
import lombok.Data;

@Data
public class EmployeeDTO {
    private Long id;
    private String firstName;
    public EmployeeDTO (Employee employee){
        this.id = employee.getId();
        this.firstName = employee.getFirstName();
    }
}
