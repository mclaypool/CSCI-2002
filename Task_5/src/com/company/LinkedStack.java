package com.company;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedStack<E> {

    // Nested Classes ----------------------------------------------------------
    private static class Node<E> {
        // Members
        private E data;
        private Node<E> next;

        // Constructors
        private Node(E obj) {
            data = obj;
            next = null;
        }

        private Node(E obj, Node<E> nodePointer) {
            data = obj;
            next = nodePointer;
        }
    }

    // Members -----------------------------------------------------------------
    private Node<E> topOfStackRef = null;
    private int maxNodes = 5;
    private int count = 0;


    // Constructors ------------------------------------------------------------
    public LinkedStack() {
    }

    public LinkedStack(E obj) {
        push(obj);
    }

    public LinkedStack(E obj, int size) {
        this.setMaxNodes(size);
        push(obj);
    }

    // Private Methods ---------------------------------------------------------
    private void resize() {
        maxNodes = maxNodes * 2;
    }

    // Public Methods ----------------------------------------------------------
    public E push(E obj) {
        //if (count+1 > maxNodes) { throw new StackOverflowError(); }
        if (count+1 > maxNodes) { resize(); }
        topOfStackRef = new Node<>(obj, topOfStackRef);
        count++;
        return obj;
    }

    public E pop() throws EmptyStackException {
        if (empty()) {
            throw new EmptyStackException();
        } else {
            E result = topOfStackRef.data;
            topOfStackRef = topOfStackRef.next;
            count--;
            return result;
        }
    }

    public E peek() throws EmptyStackException {
        if (empty()) {
            throw new EmptyStackException();
        } else {
            return topOfStackRef.data;
        }
    }

    public boolean empty() {
        return topOfStackRef == null;
    }

    public boolean isFull() {
        if (count >= maxNodes) {
            return true;
        }
        return false;
    }

    public void setMaxNodes(int maxNodes) throws IllegalArgumentException {
        if (maxNodes <= 0 || maxNodes < count) {
            throw new IllegalArgumentException();
        }
        this.maxNodes = maxNodes;
    }

    public void reInitialize() {
        topOfStackRef = null;
        count = 0;
        maxNodes = 5;
    }

    public int getMaxNodes() {
        return maxNodes;
    }

    public int getCount() {
        return count;
    }
}
