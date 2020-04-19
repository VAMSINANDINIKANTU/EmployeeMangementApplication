package com.employeeapp.model.service;
import java.util.List;
import java.util.Optional;
import com.employeeapp.model.entities.Employer;
public interface EmployerService {
	public List<Employer> findAll();
	public Optional<Employer> findEmployerById(Long id);
	public Optional<Employer> findByemployerName(String employerName);
}