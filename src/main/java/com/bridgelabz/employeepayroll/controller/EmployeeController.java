package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.entity.EmployeePayroll;
import com.bridgelabz.employeepayroll.repository.IEmployeePayroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    IEmployeePayroll repo;

    @GetMapping("/employeePayroll")
    public List<EmployeePayroll> getAllEmployeeDetails(){
        List<EmployeePayroll> employeePayrolls = repo.findAll();
        return employeePayrolls;
    }

    @GetMapping("/employeePayroll/{id}")
    public EmployeePayroll getEmployee(@PathVariable int id){
        EmployeePayroll employeePayroll = repo.findById(id).get();
        return employeePayroll;
    }
    @PostMapping("/employeePayroll/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createEmployeePayroll(@RequestBody EmployeePayroll employeePayroll){
        repo.save(employeePayroll);
    }

    @PutMapping("/employeePayroll/update/{id}")
    public EmployeePayroll updateEmployeePayroll(@PathVariable int id){
        EmployeePayroll employeePayroll = repo.findById(id).get();
        employeePayroll.setEmployeeName("hari");
        employeePayroll.setProfilePicture("3");
        employeePayroll.setSalary(49000);
        employeePayroll.setStartDate("09.09.2023");
        employeePayroll.setGender("male");
        employeePayroll.setNotes("da");
        repo.save(employeePayroll);
        return employeePayroll;
    }

    @DeleteMapping("employeePayroll/delete/{id}")
    public void deleteEmployeePayroll(@PathVariable int id){
        EmployeePayroll employeePayroll = repo.findById(id).get();
        repo.delete(employeePayroll);

    }
}
