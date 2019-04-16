package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {11, 121, 144, 19, 161, 19, 144, 19};
        if (sameElements(a, b)) {
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
        }
        int[] c = {11, 121, 144, 18, 161, 19, 144, 19};

        /* This looks to be done in error, I reversed the conditionals below
        if (sameElements(a, c)) {
            System.out.println("Test 2 failed");
        } else {
            System.out.println("Test 2 passed");
        }*/
        if (sameElements(a, c)) {
            System.out.println("Test 2 passed");

        } else {
            System.out.println("Test 2 failed");
        }

    }

    public static boolean sameElements(int[] a, int[] b) {
        // quickly rule out lists of different lengths
        if (a.length != b.length) {
            return false;
        }

        // use the built in Quicksort sort method
        // so I can use the built in array comparison (I think its a loop)
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
