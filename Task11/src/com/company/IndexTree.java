package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class IndexTree<E> implements Serializable {

    private Node root;

    // Constructors ------------------------------------------------------------
    public IndexTree(){ }

    public IndexTree(String word, int lineNumber){
        root = new Node(word, lineNumber);
    }

    // Private Methods ---------------------------------------------------------
    private boolean find(Node current, String word, int lineNumber) {
        if (current == null) {
            return false;
        }
        else if (word.equals(current.word)) {
            current.add(lineNumber);
            return true;
        } else {
            find(current.left, word, lineNumber);
            find(current.right, word, lineNumber);
        }
        return false;
    }

    private void inOrderTraverse(Node node) {
        if (node != null) {
            inOrderTraverse(node.left);
            System.out.println(node.toString());
            inOrderTraverse(node.right);
        }
    }

    private Node addRecursive(Node current, String word, int lineNumber) {
        if (current == null) {
            return new Node(word, lineNumber);
        } else if (word.compareTo(current.word) == 0) {
            return current;
        } else if (word.compareTo(current.word) < 0) {
            current.left = addRecursive(current.left, word, lineNumber);
            return current;
        } else {
            current.right = addRecursive(current.right, word, lineNumber);
            return current;
        }
    }

    // Public Methods ----------------------------------------------------------
    public void add(String word, int lineNumber) {
        word = word.toLowerCase();

        // search, if found add info to node
        boolean found = find(root, word, lineNumber);

        // add new node
        if (!found) {
            root = addRecursive(root, word, lineNumber);
        }
    }

    public void print() {
        System.out.println("[");
        inOrderTraverse(root);
        System.out.println("]");
    }

    // Setter and Getters ------------------------------------------------------
    public Node getRoot() {
        return root;
    }

    // Node class --------------------------------------------------------------
    private class Node {
        private String word;
        private int count = 0;
        private ArrayList<Integer> lineNumbers = new ArrayList<>();
        private Node left, right;

        public Node(String value, int lineNumber)
        {
            word = value.toLowerCase();
            count++;
            lineNumbers.add(lineNumber);
            left = right = null;
        }

        public void add(int lineNumber) {
            count++;
            lineNumbers.add(lineNumber);
        }

        @Override
        public String toString() {
            return String.format(
                    "\t{"
                            + "%n\t\t\"word\": \"%s\","
                            + "%n\t\t\"count\": %s,"
                            + "%n\t\t\"line_numbers\": %s,"
                            + "%n\t\t\"left_word\": %s,"
                            + "%n\t\t\"right_word\": %s"
                    +"%n\t},",
                    word, count, lineNumbers,
                    left == null ? "\"\"" : left.word,
                    right == null ? "\"\"" : right.word
            );
        }
    }
}
