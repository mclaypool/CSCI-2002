package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        /*
        Please see the unit tests for testing my function.
        You can change the input on any of the tests to try your own list.
        I tried to test many different types of inputs already.
        */


        /*
        // I couldn't get this working. The objects were never the same as input strings...
        // I even wrote unittests to test the ArrayList to Array conversion too,
        // so I don't think it was that...

        Scanner input = new Scanner(System.in);
        ArrayList inputArray = new ArrayList();

        // get array
        out.println("Please enter the length of your array");
        out.print(">> ");
        int length;
        try {
            length = input.nextInt();
        }
        catch (java.util.InputMismatchException e) {
            out.println("You must input a whole number");
            return;
        }

        out.println("\nPlease enter the array values");
        for (int i = 0; i < length; i++) {
            out.print(">> ");
            inputArray.add(input.next());
        }

        int longestStreak = StreakCalc.longestStreak(inputArray.toArray());
        out.printf("%nThe longest streak was: %s", longestStreak);
        */
    }
}
