package com.fabiocarlesso.datarestexemple.domain.view;

import com.fabiocarlesso.datarestexemple.domain.entities.Employee;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.rest.core.config.Projection;

@JsonPropertyOrder({"firstName", "lastName"})
@Projection(name = "employee-view", types = Employee.class)
public interface EmployeeView {
    String getFirstName();
    String getLastName();
}
