package com.company;

import java.util.ArrayList;

public class StreakCalc {
    public static <T> int longestStreak(T[] inputArray){
        if (inputArray.length < 2){
            return 1;
        }

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] == inputArray[i-1]) {
                currentStreak++;
            }
            else {
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
            }
        }

        return longestStreak;
    } // func
} // class
