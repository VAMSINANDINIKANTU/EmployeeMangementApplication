package com.employeeapp.model.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeeapp.model.entities.Employee;
import com.employeeapp.model.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService{
	@Autowired
	private EmployeeRepository repo;
	List<Employee> limitSalary = new ArrayList<Employee>();
        @Override
	public List<Employee> findAll() {
		return repo.findAll();
	}
        @Override
	public Optional<Employee> findEmployeeById(Long id) {
		return repo.findEmployeeById(id);
	}
        @Override
	public List<Employee> salaryLimit(double salary) {
		for(Employee e:findAll()) {
			if(e.getSalary()>salary) {
				limitSalary.add(e);
		        }
		}
	        return limitSalary;
	}
        @Override
	public Optional<Employee> findByfirstName(String firstName) {
	    return repo.findByfirstName(firstName);
	}
}
