package org.example;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws EmptyElementException {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        System.out.println(list.get(3));
        System.out.println(list.get(4));
        list.delete(5);
        System.out.println(list.pop());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.size());
    }

}