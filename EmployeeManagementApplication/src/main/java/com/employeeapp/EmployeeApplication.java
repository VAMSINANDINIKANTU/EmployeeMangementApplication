package com.employeeapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.employeeapp.model.entities.Employee;
import com.employeeapp.model.entities.Employer;
import com.employeeapp.model.repository.EmployeeRepository;
import com.employeeapp.model.repository.EmployerRepository;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {
    @Autowired
	private EmployerRepository employerReposiotory;
    @Autowired
	private EmployeeRepository employeeRepository;
    public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
    @Override
	public void run(String... args) throws Exception {
		/*
		 * Employer employer1=new Employer("ramyabopal","Bangolre"); Employer
		 * employer2=new Employer("Jhonmhetha","chenai");
		 * employerReposiotory.save(employer1); employerReposiotory.save(employer2);
		 * 
		 * Employee employee1=new
		 * Employee("venky","kantu",25000,"developer","5678902443","Delhi"); Employee
		 * employee2=new Employee("krithi","das",10000,"tester","5678902443","chennai");
		 * Employee employee3=new
		 * Employee("poulami","mohan",15000,"ui","8978902443","Bangolre"); Employee
		 * employee4=new
		 * Employee("manikanta","guptha",18000,"devops","5678902783","Guntur"); Employee
		 * employee5=new
		 * Employee("sai","kumar",8000,"networking","8678902443","Vijayawada"); Employee
		 * employee6=new
		 * Employee("hari","nandan",6000,"supporter","4478902443","noida"); Employee
		 * employee7=new
		 * Employee("vikash","prabhu",9000,"pega","9678902443","hyderabad");
		 * 
		 * employee1.setEmployer(employer1); employee2.setEmployer(employer1);
		 * employee3.setEmployer(employer1); employee5.setEmployer(employer1);
		 * employee4.setEmployer(employer2); employee6.setEmployer(employer2);
		 * employee7.setEmployer(employer2);
		 * 
		 * employeeRepository.save(employee1); employeeRepository.save(employee2);
		 * employeeRepository.save(employee3); employeeRepository.save(employee4);
		 * employeeRepository.save(employee5); employeeRepository.save(employee6);
		 * employeeRepository.save(employee7);
		 */
    }
}
