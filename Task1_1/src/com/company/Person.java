package com.company;

public class Person {
    // Members -----------------------------------------------------------------
    private String name;
    private String ssn;
    private int age;
    private String gender;
    private String address;
    private String phone;

    // Constructors ------------------------------------------------------------
    public Person() { }

    public Person(String name, String ssn, int age,
                  String gender, String address, String phone)
    {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    // Methods -----------------------------------------------------------------
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    // Standard Setter and Getter Methods --------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
