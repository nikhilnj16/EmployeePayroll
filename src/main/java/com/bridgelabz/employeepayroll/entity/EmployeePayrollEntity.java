package com.bridgelabz.employeepayroll.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "employee")
public class EmployeePayrollEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column
    private String employeeName;
    @Column
    private String profilePicture;
    @Column
    private int salary;
    @Column
    private String startDate;
    @Column
    private String gender;
    @Column
    private String notes;

}
