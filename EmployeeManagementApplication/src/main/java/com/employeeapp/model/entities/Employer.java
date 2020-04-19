package com.employeeapp.model.entities;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employer_table_new")
public class Employer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String employerName;
	private String address;
	@OneToMany(mappedBy = "employer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Employee> Employees = new ArrayList<>();
    public List<Employee> getEmployees() {
		return Employees;
	}
    public void setEmployees(List<Employee> employees) {
		this.Employees = employees;
	}
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getAddress() {
		return address;
	}
    public void setAddress(String address) {
		this.address = address;
	}
   
    public Employer() {
		super();
	}
    public void addEmployee(Employee employee) {
		Employees.add(employee);
		employee.setEmployer(this);
	}
    @Override
	public String toString() {
		return "Employer [employerName=" + employerName + ", address=" + address + "]";
	}
	public Employer(String employerName, String address) {
		super();
		this.employerName = employerName;
		this.address = address;
		
	}
}
