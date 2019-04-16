package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        I'm not surprised by the equation's flipping from y1 > y2 to y1 < y2.
        y1 grows at linear rate while y2's growth eventually goes exponential.
        So y1 was always going to end up less than y2 it was just a question of
        when. I did think it was going to happen closer to 10 though.
         */

        for ( int n = 0; n < 100; n++) {
            int y1 = 100 * n + 10;
            int y2 = 5 * n * n + 2;

            System.out.printf("%s:\t%s -- %s\t%s%n", n, y1, y2, whichGreater(y1, y2));
        }
    }

    public static String whichGreater(int y1, int y2) {
        if (y1 == y2) {
            return "same";
        } else if (y1 > y2){
            return "y1";
        }
        return "y2";
    }
}
