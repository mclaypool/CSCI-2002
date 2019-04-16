package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // get file path
        out.println("Please enter the path to your test file");
        out.print("> ");
        final String filePath = input.next();
        //final String filePath = "test_input.txt"; //test with local file

        // Get file with scanner
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // loop elements separated by whitespace
            while (scanner.hasNext()) {
                String fileElement = scanner.next();

                // print everything besides ints with parseInt try catch
                try {
                    Integer.parseInt(fileElement);
                } catch (Exception e) {
                    out.println(fileElement);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            out.println("File not found");
        }
    }
}
