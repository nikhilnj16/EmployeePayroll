package com.bridgelabz.employeepayroll.services;

import com.bridgelabz.employeepayroll.entity.EmployeePayrollEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollEntity> getAllEmployeeDetails();
    EmployeePayrollEntity getEmployee(@PathVariable int id);
    void createEmployeePayroll(@PathVariable EmployeePayrollEntity id);
    EmployeePayrollEntity updateEmployeePayroll(@PathVariable int id);
    void deleteEmployeePayroll(@PathVariable int id);
}
