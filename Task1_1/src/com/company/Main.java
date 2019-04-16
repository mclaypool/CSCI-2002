package com.company;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        // This is to satisfy the requirement for the user to be able to enter a person
        // Please see my unit test for using all of the classes

        Scanner input = new Scanner( System.in );
        People people = new People();

        people.add(
                new Person("Pete", "123456789", 30, "Male", "123 Street", "312555555")
        );

        // get one more person from user ---------------------------------------
        Person input_person = new Person();

        out.println("Please enter a name: ");
        input_person.setName(input.next());

        out.println("Please enter their SSN: ");
        input_person.setSsn(input.next());

        out.println("Please enter their age: ");
        input_person.setAge(input.nextInt());

        out.println("Please enter their gender: ");
        input_person.setGender(input.next());

        out.println("Please enter their address: ");
        input_person.setAddress(input.next());

        out.println("Please enter their phone: ");
        input_person.setPhone(input.next());

        people.add(input_person);

        out.println("\nPeople currently in system:");
        out.println(people.toString());
    }
}
