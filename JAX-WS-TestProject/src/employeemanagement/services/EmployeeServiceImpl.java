package employeemanagement.services;

import javax.jws.WebService;

import employeemanagement.domaine.Employee;

@WebService
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployeeById(String id) 
	{
		return new Employee("1", "Dick Chesterwood");
	}

}
