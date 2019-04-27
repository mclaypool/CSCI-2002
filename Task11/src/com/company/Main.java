package com.company;

import java.io.File;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        final IndexTree<String> wordTree= new IndexTree<>();
        final File folder  = new File("src/file_goes_here/");

        System.out.printf("Please place your file in the following directory: %s", folder.getAbsolutePath());
        System.out.println();
        System.out.println("Only the first file alphabetically will be used.");
        System.out.println("Press enter when ready");
        new Scanner(System.in).nextLine();

        // get files and sort alphabetically
        File[] files =  folder.listFiles();
        if (files.length <= 0) {
            System.out.println("No files were found");
            return;
        }
        Arrays.sort(files);

        // loop each word and add to tree
        try {
            Scanner s = new Scanner(files[0]);

            int lineNumber = 0;
            while (s.hasNextLine()) {
                lineNumber++;
                String word = s.nextLine();
                if (word.equals("")) continue;

                // add to tree
                wordTree.add(word, lineNumber);
                //System.out.printf("%nword: %s, line: %s", word, lineNumber);
            }

            // inorder traversal to print nodes
            wordTree.print();

        } catch (IOException e) {
            System.out.println("Error accessing file");
        }
    }
}
