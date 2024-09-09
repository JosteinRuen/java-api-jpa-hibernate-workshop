package com.booleanuk.api.employees.repository;

import com.booleanuk.api.employees.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
