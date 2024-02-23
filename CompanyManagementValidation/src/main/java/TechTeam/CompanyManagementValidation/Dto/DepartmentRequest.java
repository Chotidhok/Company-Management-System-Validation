package TechTeam.CompanyManagementValidation.Dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class DepartmentRequest {
	
	@NotNull(message="id should not be null")
	private Long id;
	
	@NotNull(message="name should not be null")
	private String name;
	
	@NotNull(message="position should not be null")
	private String position;
	
	@NotNull(message="salry shoild not be null")
	private String salary;
	
	@Min(21)
	@Max(60)
	private int age;
	
	@NotNull(message="email should not be null")
	private String email;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
