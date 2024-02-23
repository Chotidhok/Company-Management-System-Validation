package TechTeam.CompanyManagementValidation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TechTeam.CompanyManagementValidation.Dto.DepartmentRequest;
import TechTeam.CompanyManagementValidation.Entity.Department;
import TechTeam.CompanyManagementValidation.Services.DepartmentServices;
import jakarta.validation.Valid;

@RequestMapping
@RestController
public class DepartmentController {
	
		@Autowired
		DepartmentServices departmentservice;
		
	     @PostMapping("/signup")
		public ResponseEntity <Department> save(@RequestBody @Valid DepartmentRequest departmentrequest ) {
			return new ResponseEntity<>(departmentservice.saveDepartment(departmentrequest),HttpStatus.CREATED);
		
	     
	     }
	 }
	     
	     
	     
	     
	     
//		@GetMapping("/find/{id}")
//		private Department findbyid(@PathVariable Long id) {
//			return departmentservice.findbyid(id);
//		}
//		
//		@GetMapping("/findAll")
//		private List<Department>findAll(){
//			return departmentservice.findAll();
//		}
//		

		
		
	


