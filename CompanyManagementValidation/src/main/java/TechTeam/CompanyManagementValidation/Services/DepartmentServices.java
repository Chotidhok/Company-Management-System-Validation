package TechTeam.CompanyManagementValidation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TechTeam.CompanyManagementValidation.Dto.DepartmentRequest;
import TechTeam.CompanyManagementValidation.Entity.Department;
import TechTeam.CompanyManagementValidation.Repository.DepartmentRepository;

@Service
public class DepartmentServices {
		
		@Autowired
		 private DepartmentRepository departmentrepository;
		
		public Department saveDepartment(DepartmentRequest departmentrequest) {
		  Department department=new Department();
		  
		  department.setName(departmentrequest.getName());
		  department.setAge(departmentrequest.getAge());
		  department.setEmail(departmentrequest.getEmail());
		  department.setPosition(departmentrequest.getPosition());
		  department.setSalary(departmentrequest.getSalary());
		  department.setId(departmentrequest.getId());
		  
		  return departmentrepository.save(department);
		}





}		