package com.fabiocarlesso.datarestexemple.repository;

import com.fabiocarlesso.datarestexemple.domain.entities.Employee;
import com.fabiocarlesso.datarestexemple.domain.view.EmployeeView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path="members", excerptProjection = EmployeeView.class)
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByFirstName(@Param("firstName") String firstName);
}
