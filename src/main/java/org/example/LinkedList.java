package org.example;

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(Integer a) throws EmptyElementException {
        Node newNode = new Node();
        newNode.data = a;
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size += 1;
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (this.size == 0) {
            throw new IndexOutOfBoundsException("LinkedList is empty");
        }
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        size--;
    }

    @Override
    public Integer pop() {
        if (head == null) {
            System.out.println("LinkedList is empty");
        }

        if (head.next == null) {
            Integer data = head.data;
            head = null;
            size--;
            return data;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        Integer data = current.next.data;
        current.next = null;
        size--;

        return data;
    }
}
