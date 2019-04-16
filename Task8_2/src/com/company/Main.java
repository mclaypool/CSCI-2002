package com.company;

import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        out.println("Please input a string of chars.");
        out.println("Only letters, numbers and special chars are allowed.");
        out.println("Spaces and tabs will be ignored. Newlines will end the input\n");
        out.print(">>");

        CharProcessor processor = new CharProcessor(input.nextLine());

        out.printf("%nForward: %s", processor.getForwardArrayString());
        out.printf("%nReverse: %s%n", processor.getReverseArrayString());

        out.println("\nBoth as strings:");
        out.printf("--Forward: '%s'", processor.getForwardString());
        out.printf("%n--Reverse: '%s'%n", processor.getReverseString());
    }
}
