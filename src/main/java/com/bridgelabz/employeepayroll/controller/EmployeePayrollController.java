package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.entity.EmployeePayrollEntity;
import com.bridgelabz.employeepayroll.repository.IEmployeePayrollRepository;
import com.bridgelabz.employeepayroll.services.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeePayrollController {
    @Autowired
    private IEmployeePayrollService service;

    @GetMapping("/employeePayroll")
    public List<EmployeePayrollEntity> findAllEmployeeDetails(){
        return service.getAllEmployeeDetails();
    }

    @GetMapping("/employeePayroll/{id}")
    public EmployeePayrollEntity findEmployee(@PathVariable int id){
        return service.getEmployee(id);
    }

    @PostMapping("/employeePayroll/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createEmployeePayroll(@RequestBody EmployeePayrollEntity employeePayroll){
        service.createEmployeePayroll(employeePayroll);
    }

    @PutMapping("/employeePayroll/update/{id}")
    public EmployeePayrollEntity updateEmployeePayroll(@PathVariable int id){
        return service.updateEmployeePayroll(id);
    }

    @DeleteMapping("employeePayroll/delete/{id}")
    public void deleteEmployeePayroll(@PathVariable int id){
        service.deleteEmployeePayroll(id);

    }
}
