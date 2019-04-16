package com.company;

public class EmployeeHourly extends Employee{
    // Members -----------------------------------------------------------------
    private double hoursWorked;
    private double hourlyRate;
    private double unionDues;

    // Constructors ------------------------------------------------------------
    public EmployeeHourly() { }

    public EmployeeHourly(String name, String ssn, int age, String gender,
                          String address, String phone, String department,
                          String jobTitle, int hireYear, double hoursWorked,
                          double hourlyRate, double unionDues)
    {
        super(name, ssn, age, gender, address,
                phone, department, jobTitle, hireYear);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.unionDues = unionDues;
    }

    // Methods -----------------------------------------------------------------
    @Override
    public String toString() {
        return "EmployeeHourly{" +
                "name='" + super.getName() + '\'' +
                ", ssn='" + super.getSsn() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", department='" + super.getDepartment() + '\'' +
                ", jobTitle='" + super.getJobTitle() + '\'' +
                ", hireYear=" + super.getHireYear() +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", unionDues=" + unionDues +
                "}";
    }

    // Standard Setter and Getter Methods --------------------------------------
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getUnionDues() {
        return unionDues;
    }

    public void setUnionDues(double unionDues) {
        this.unionDues = unionDues;
    }
}
