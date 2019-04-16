/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.EmptyStackException;

/** Class to check for balanced parentheses.
 *  @author Koffman & Wolfgang
 **/
public class ParenChecker {

    // Constants
    /** Set of opening parenthesis characters. */
    private static final String OPEN = "([{";
    /** Set of closing parenthesis characters, matches OPEN. */
    private static final String CLOSE = ")]}";

    public static boolean isBalanced(String expression) {
        // Create an empty stack.
        LinkedStack s = new LinkedStack();
        boolean balanced = true;
        try {
            int index = 0;
            while (balanced && index < expression.length()) {
                char nextCh = expression.charAt(index);
                if (isOpen(nextCh)) {
                    s.push(nextCh);
                } else if (isClose(nextCh)) {
                    char topCh = (char) s.pop();
                    balanced =
                        OPEN.indexOf(topCh) == CLOSE.indexOf(nextCh);
                }
                index++;
            }
        } catch (EmptyStackException ex) {
            balanced = false;
        }
        return (balanced && s.empty());
    }

    /**
     * Method to determine whether a character is one of the
     * opening parentheses.
     * @param ch Character to be tested
     * @return true if ch is one of the opening parentheses
     */
    private static boolean isOpen(char ch) {
        return OPEN.indexOf(ch) > -1;
    }

    /**
     * Method to determine whether a character is one of the
     * closing parentheses.
     * @param ch Character to be tested
     * @return true if ch is one of the closing parentheses
     */
    private static boolean isClose(char ch) {
        return CLOSE.indexOf(ch) > -1;
    }
}
