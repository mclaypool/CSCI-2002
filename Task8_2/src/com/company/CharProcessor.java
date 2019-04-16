package com.company;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharProcessor {

    // created a separate class for unittesting purposes
    private String original;
    private String cleaned;
    private Deque<Character> forward = new LinkedList<>();
    private Deque<Character> reverse = new LinkedList<>();

    CharProcessor(String input){
        original = input;
        cleaned = input.replaceAll("\\s+","");
        cleaned = cleaned.replaceAll("\n", "");

        for (int i = 0; i < cleaned.length(); i++){
            char c = cleaned.charAt(i);

            forward.add(c);
            reverse.addFirst(c);
        }
    }

    private String convertToString(Deque<Character> input){
        int length = input.size();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < length; i++) {
            output.append(input.poll());
        }
        return output.toString();
    }

    public String getOriginal() {
        return original;
    }

    public String getCleaned() {
        return cleaned;
    }

    public String getForwardArrayString() {
        return forward.toString();
    }

    public String getReverseArrayString() {
        return reverse.toString();
    }

    public String getForwardString() {
        return convertToString(forward);
    }

    public String getReverseString() {
        return convertToString(reverse);
    }


}
