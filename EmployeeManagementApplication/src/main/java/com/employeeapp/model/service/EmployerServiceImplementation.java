package com.employeeapp.model.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeeapp.model.entities.Employer;
import com.employeeapp.model.repository.EmployerRepository;

@Service
@Transactional
public class EmployerServiceImplementation implements EmployerService{
	@Autowired
	private  EmployerRepository repo;
    @Override
	public List<Employer> findAll() {
		return repo.findAll();
	}
	@Override
	public Optional<Employer> findEmployerById(Long id) {
		return repo.findEmployerById(id);
	}
	@Override
	public Optional<Employer> findByemployerName(String employerName) {
		return repo.findByemployerName(employerName);
	}
}