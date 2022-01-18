package com.jmjt.service.employee;

import java.util.List;

import com.jmjt.error.InternalServerError;
import com.jmjt.error.NotFoundException;
import com.jmjt.error.RecordNotFoundException;
import com.jmjt.model.Employee;
import com.jmjt.request.EmployeeCreateRequest;
import com.jmjt.request.EmployeeUpdateRequest;

public interface EmployeeService {

	List<Employee> fetchAllEmployees();

	Employee findEmployeeById(String id) throws RecordNotFoundException;

	Employee findEmployeeByIdWithCurrency(String id) throws InternalServerError;

	Employee applySalaryIncrementById(String id) throws NotFoundException;

	List<Employee> applySalaryIncrementToAll();

	Employee saveEmployee(EmployeeCreateRequest employeeCreateRequest) throws Exception;

	void deleteEmployeeById(String employeeId) throws NotFoundException;

	Employee updateEmployee(EmployeeUpdateRequest EmployeeUpdateRequest) throws Exception;

	void generateEmployeeReportById(String employeeId) throws Exception;

	void generateEmployeesReport() throws Exception;

}