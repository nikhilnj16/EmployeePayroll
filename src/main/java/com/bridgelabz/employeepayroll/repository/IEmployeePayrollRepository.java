package com.bridgelabz.employeepayroll.repository;

import com.bridgelabz.employeepayroll.entity.EmployeePayrollEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEmployeePayrollRepository extends JpaRepository<EmployeePayrollEntity, Integer> {


}