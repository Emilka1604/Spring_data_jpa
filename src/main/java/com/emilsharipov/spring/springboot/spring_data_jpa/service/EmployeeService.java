package com.emilsharipov.spring.springboot.spring_data_jpa.service;



import com.emilsharipov.spring.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee emp);

    public Employee getEmployeeById(int id);

    public void deleteEmployeeById(int id);

    public List<Employee> findAllByName(String name);
}
