package com.company;

public class EmployeeSalary extends Employee{
    // Members -----------------------------------------------------------------
    private double annualSalary;

    // Constructors ------------------------------------------------------------
    public EmployeeSalary() { }

    public EmployeeSalary(String name, String ssn, int age, String gender,
                          String address, String phone, String department,
                          String jobTitle, int hireYear, double annualSalary)
    {
        super(name, ssn, age, gender, address,
                phone, department, jobTitle, hireYear);

        this.annualSalary = annualSalary;
    }

    // Methods -----------------------------------------------------------------
    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "name='" + super.getName() + '\'' +
                ", ssn='" + super.getSsn() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", department='" + super.getDepartment() + '\'' +
                ", jobTitle='" + super.getJobTitle() + '\'' +
                ", hireYear=" + super.getHireYear() +
                ", annualSalary=" + annualSalary +
                "}";
    }

    // Standard Setter and Getter Methods --------------------------------------
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
