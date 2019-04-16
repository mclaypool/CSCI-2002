package com.company;

public class Main {

    public static void main(String[] args) {
        // just for manual testing before writing unit tests
        int a = 1;
        int b = 4;
        System.out.printf("%n%s%n", recursive_sum(a, b));
    }

    public static int recursive_sum(int a , int b) throws IllegalArgumentException{
        // works whether b or a is greater and with negative numbers

        //System.out.printf("a:%s, b:%s%n", a, b);
        if (a == b) {
            return a;
        }
        if (a > b) {
            return a + recursive_sum(a - 1, b);
        }
        if (a < b) {
            return b + recursive_sum(a, b - 1);
        }

        // throw error in case function ever reaches the end (it shouldn't)
        throw new IllegalArgumentException();
    }
}
