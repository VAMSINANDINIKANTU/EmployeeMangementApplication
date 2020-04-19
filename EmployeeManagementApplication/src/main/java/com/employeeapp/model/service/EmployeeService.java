package com.employeeapp.model.service;
import java.util.List;
import java.util.Optional;
import com.employeeapp.model.entities.Employee;
public interface EmployeeService {
	public List<Employee> findAll();
	public Optional<Employee> findEmployeeById(Long id);
	public List<Employee> salaryLimit(double salary);
	public Optional<Employee> findByfirstName(String firstName);
}