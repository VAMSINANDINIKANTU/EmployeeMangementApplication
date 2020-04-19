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
import com.employeeapp.model.entities.Employer;
import com.employeeapp.model.exceptions.EmployerNotFoundException;
import com.employeeapp.model.service.EmployerService;

@RestController
@RequestMapping(path = "/myapi")
public class EmployerRestController {
	private EmployerService employerservice;
        @Autowired
	public EmployerRestController(EmployerService employerservice) {
		super();
		this.employerservice = employerservice;
	}

	@GetMapping(path = "/employer", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employer>> getAllEmployers() {
		return new ResponseEntity<List<Employer>>(employerservice.findAll(), HttpStatus.OK);
	}

	@GetMapping(path = "/employer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employer> getAnBook(@PathVariable(name = "id") Long id) {
		Employer employer = employerservice.findEmployerById(id).orElseThrow(EmployerNotFoundException::new);
		return new ResponseEntity<Employer>(employer, HttpStatus.OK);
       }
	
	@GetMapping(path = "/employerName/{employerName}", produces = MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<Employer>getAnEmployer(@PathVariable(name = "employerName") String employerName) {
	    Employer employer =employerservice.findByemployerName(employerName).orElseThrow(EmployerNotFoundException::new); 
	    return new ResponseEntity<Employer>(employer, HttpStatus.OK);
       }
}
