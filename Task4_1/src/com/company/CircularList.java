package com.company;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class CircularList<E> extends AbstractSequentialList<E> {
    // I tried to overload LinkedList but after reading the docs it turns out
    // the node is protected. So to follow the directions of building off
    // an already implemented list object, I am wrapping the Linked List class
    // and implementing a new iterator.

    private LinkedList<E> data; // Use the built-in doubly linked list as a base

    // Constructors ------------------------------------------------------------
    public CircularList() {
        data = new LinkedList<>();
    }

    public CircularList(Collection<E> list) {
        data = new LinkedList<>();
        data.addAll(list);
    }

    // Methods -----------------------------------------------------------------
    public int size() {
        return data.size();
    }

    // create a circular index
    private int calcUnderlyingStartIndex(int circularIndex) {
        if (circularIndex <= size()) {
            // no need to calculate it
            return circularIndex;
        }
        return circularIndex % size();
    }

    // wrap the underlying iterator so that it continues indefinitely
    public ListIterator<E> listIterator(int index) {
        return new ListIterator<E>() {

            // get iterator from underlying linked list
            private int underlyingStartIndex = calcUnderlyingStartIndex(index);
            private ListIterator<E> dataIter = data.listIterator(underlyingStartIndex);
            private int circularIndex = index;

            @Override
            public boolean hasNext() {
                // always true if size is > 0
                return size() > 0;
            }

            @Override
            public E next() {
                if (!hasNext()) throw new IndexOutOfBoundsException();

                // reset underlying iterator to keep loop going
                if (!dataIter.hasNext()) {
                    dataIter = data.listIterator(0);
                }

                circularIndex++;
                return dataIter.next();
            }

            @Override
            public boolean hasPrevious() {
                // always true unless its the starting index
                return circularIndex > 0;
            }

            @Override
            public E previous() {
                if (!hasPrevious()) throw new IndexOutOfBoundsException();

                // reset underlying iterator to keep loop going
                if (!dataIter.hasPrevious())
                    dataIter = data.listIterator(size());

                circularIndex--;
                return dataIter.previous();
            }

            @Override
            public int nextIndex() { return circularIndex + 1; }

            @Override
            public int previousIndex() {
                if (!hasPrevious()) throw new IndexOutOfBoundsException();
                return circularIndex - 1;
            }

            @Override
            public void remove() {
                dataIter.remove();
            }

            @Override
            public void set(E e) {
                dataIter.set(e);
            }

            @Override
            public void add(E e) {
                dataIter.add(e);
            }
        };
    }
}
