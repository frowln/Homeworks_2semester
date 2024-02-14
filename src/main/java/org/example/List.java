package org.example;

/**
  список из однотипных элементов  Integer
  позиционный (каждый элемент занимает определенную позицию)
 */
public interface List {
    void add(Integer a) throws EmptyElementException;

    Integer get(int index) throws IndexOutOfBoundsException;

    int size();

    void delete(int index) throws IndexOutOfBoundsException;

    Integer pop();
}
