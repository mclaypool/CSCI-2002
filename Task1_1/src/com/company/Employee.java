package com.company;

public class Employee extends Person{
    // Members -----------------------------------------------------------------
    private String department;
    private String jobTitle;
    private int hireYear;

    // Constructors ------------------------------------------------------------
    public Employee() { }

    public Employee(String name, String ssn, int age, String gender,
                    String address, String phone, String department,
                    String jobTitle, int hireYear)
    {
        super(name, ssn, age, gender, address, phone);
        this.department = department;
        this.jobTitle = jobTitle;
        this.hireYear = hireYear;
    }

    // Methods -----------------------------------------------------------------
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", ssn='" + super.getSsn() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hireYear=" + hireYear +
                "}";
    }

    // Standard Setter and Getter Methods --------------------------------------
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
