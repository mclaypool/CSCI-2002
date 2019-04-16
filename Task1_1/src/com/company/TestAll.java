package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAll {

    @Test
    void testToStrings() {
        // TODO: Need to look into a better way to do this....
        String expectedValue = "[Person{name='Pete', ssn='123456789', age=30" +
                ", gender='Male', address='123 Street', phone='312555555'}" +
                ", Student{name='Karen', ssn='234567890', age=29" +
                ", gender='Female', address='123 Street', phone='3125555556'" +
                ", gpa=3.9, major='Computer Science', gradYear=2019}" +
                ", Employee{name='Dan', ssn='111111111', age=30, gender='Male'" +
                ", address='123 Street', phone='312555555', department='IT'" +
                ", jobTitle='Developer', hireYear=2012}" +
                ", EmployeeHourly{name='Amy', ssn='222222222', age=30" +
                ", gender='Female', address='123 Street', phone='312555555'" +
                ", department='IT', jobTitle='Developer', hireYear=2016" +
                ", hoursWorked=40.0, hourlyRate=50.0, unionDues=1000.0}" +
                ", EmployeeSalary{name='Mark', ssn='333333333', age=30" +
                ", gender='Male', address='123 Street', phone='312555555'" +
                ", department='IT', jobTitle='Developer', hireYear=2017" +
                ", annualSalary=100000.0}]";

        Person pete = new Person(
                "Pete", "123456789", 30, "Male", "123 Street", "312555555"
        );

        Student karen = new Student(
                "Karen", "234567890", 29, "Female", "123 Street",
                "3125555556", 3.9, "Computer Science", 2019
        );
        Employee dan = new Employee(
                "Dan", "111111111", 30, "Male", "123 Street", "312555555",
                "IT", "Developer", 2012
        );
        EmployeeHourly amy = new EmployeeHourly(
                "Amy", "222222222", 30, "Female", "123 Street", "312555555",
                "IT", "Developer", 2016, 40, 50, 1000

        );
        EmployeeSalary mark = new EmployeeSalary(
                "Mark", "333333333", 30, "Male", "123 Street", "312555555",
                "IT", "Developer", 2017, 100000
        );


        People actualValue = new People();
        actualValue.add(pete);
        actualValue.add(karen);
        actualValue.add(dan);
        actualValue.add(amy);
        actualValue.add(mark);

        assertEquals(expectedValue, actualValue.toString());
    }
}