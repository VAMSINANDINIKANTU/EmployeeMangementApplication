package com.employeeapp.model.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.employeeapp.model.entities.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {
	public List<Employer> findAll();
	public Optional<Employer> findEmployerById(Long id);
	public Optional<Employer> findByemployerName(String employerName);
}