package com.bridgelabz.employeepayroll.services;

import com.bridgelabz.employeepayroll.entity.EmployeePayrollEntity;
import com.bridgelabz.employeepayroll.repository.IEmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private IEmployeePayrollRepository repo;


    public List<EmployeePayrollEntity> getAllEmployeeDetails(){
        List<EmployeePayrollEntity> employeePayrolls = repo.findAll();
        return employeePayrolls;
    }

    public EmployeePayrollEntity getEmployee(@PathVariable int id){
        EmployeePayrollEntity employeePayroll = repo.findById(id).get();
        return employeePayroll;
    }
    public void createEmployeePayroll(@RequestBody EmployeePayrollEntity employeePayroll){
        repo.save(employeePayroll);

    }

    public EmployeePayrollEntity updateEmployeePayroll(@PathVariable int id){
        EmployeePayrollEntity employeePayroll = repo.findById(id).get();
        employeePayroll.setEmployeeName("hari");
        employeePayroll.setProfilePicture("3");
        employeePayroll.setSalary(49000);
        employeePayroll.setStartDate("09.09.2023");
        employeePayroll.setGender("male");
        employeePayroll.setNotes("da");
        repo.save(employeePayroll);
        return employeePayroll;
    }

    public void deleteEmployeePayroll(@PathVariable int id){
        EmployeePayrollEntity employeePayroll = repo.findById(id).get();
        repo.delete(employeePayroll);


    }
}
