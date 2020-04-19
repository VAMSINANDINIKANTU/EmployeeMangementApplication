package com.employeeapp.model.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.employeeapp.model.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public List<Employee> findAll();
    public Optional<Employee> findEmployeeById(Long id);
    public Optional<Employee> findByfirstName(String firstName);
}
