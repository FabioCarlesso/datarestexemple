package com.fabiocarlesso.datarestexemple.controller;

import com.fabiocarlesso.datarestexemple.domain.dto.EmployeeDTO;
import com.fabiocarlesso.datarestexemple.domain.entities.Employee;
import com.fabiocarlesso.datarestexemple.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RepositoryRestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;
    @GetMapping("/members/firstname")
    ResponseEntity<?> employees(PagedResourcesAssembler resourcesAssembler) {
        Page<Employee> employees = this.repository.findAll(Pageable.ofSize(20));
        Page<EmployeeDTO> employeeDtos = employees.map(EmployeeDTO::new);
        PagedModel<EntityModel<EmployeeDTO>> pagedModel = resourcesAssembler.toModel(employeeDtos);
        return ResponseEntity.ok(pagedModel);
    }
}
