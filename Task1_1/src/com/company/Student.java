package com.company;

public class Student extends Person{
    // Members -----------------------------------------------------------------
    private double gpa;
    private String major;
    private int gradYear;

    // Constructors ------------------------------------------------------------
    public Student() { }

    public Student(String name, String ssn, int age,
                   String gender, String address, String phone, double gpa,
                   String major, int gradYear)
    {
        super(name, ssn, age, gender, address, phone);
        this.gpa = gpa;
        this.major = major;
        this.gradYear = gradYear;
    }

    // Methods -----------------------------------------------------------------
    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", ssn='" + super.getSsn() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                ", gradYear=" + gradYear +
                "}";
    }

    // Standard Setter and Getter Methods --------------------------------------
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
