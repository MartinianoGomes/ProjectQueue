package entities;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int n;

    private class LinkedIterator implements Iterator<Item> {
        private Node current;

        public LinkedIterator() {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext())
                throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;

            return item;
        }
    }

    private class Node {
        private Item item;
        private Node next;
    }

    public Item peak(){
        if (isEmpty())
            throw new NoSuchElementException("Empty stack");

        return first.item;
    }

    public Item base(){
        if (isEmpty())
            throw new NoSuchElementException("Empty stack");

        return last.item;
    }

    public Item pop() {
        Item item = null;

        if (isEmpty())
            throw new NoSuchElementException();
        else {
            item = first.item;
            first = first.next;
            n--;

            if (first == null) {
                last = null;
            }
        }

        return item;
    }

    public void push(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

        n++;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Stack() {
        first = null;
        last = null;
        n = 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedIterator();
    }
}