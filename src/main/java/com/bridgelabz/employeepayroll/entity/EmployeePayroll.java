package com.bridgelabz.employeepayroll.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeePayroll {
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

    public EmployeePayroll(int employeeId, String employeeName, String profilePicture, int salary, String startDate, String gender, String notes) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.profilePicture = profilePicture;
        this.salary = salary;
        this.startDate = startDate;
        this.gender = gender;
        this.notes = notes;
    }

    public EmployeePayroll() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "employeeName='" + employeeName + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", salary=" + salary +
                ", startDate='" + startDate + '\'' +
                ", gender='" + gender + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
