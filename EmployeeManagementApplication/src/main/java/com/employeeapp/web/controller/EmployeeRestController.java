package com.employeeapp.web.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employeeapp.model.entities.Employee;
import com.employeeapp.model.exceptions.EmployeeNotFoundException;
import com.employeeapp.model.exceptions.EmployerNotFoundException;
import com.employeeapp.model.service.EmployeeService;

@RestController
@RequestMapping(path="/api")
public class EmployeeRestController {
	private EmployeeService employeeservice;
    @Autowired
	public EmployeeRestController(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}
    
    @GetMapping(path = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return new ResponseEntity<List<Employee>>(employeeservice.findAll(), HttpStatus.OK);
	}

    @GetMapping(path = "/employee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getAnBook(@PathVariable(name = "id") Long id) {
		Employee employee = employeeservice.findEmployeeById(id).orElseThrow(EmployerNotFoundException::new);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
    @GetMapping(path="/employee/limit/{salary}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getByPriceLimit(@PathVariable(name="salary")double salary){
		return new ResponseEntity<List<Employee>>(employeeservice.salaryLimit(salary),HttpStatus.OK);
	}
	
    @GetMapping(path = "/employeeName/{firstName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getAnEmployee(@PathVariable(name = "firstName") String firstName) {
        Employee employee = employeeservice.findByfirstName(firstName).orElseThrow(EmployeeNotFoundException::new);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
}
