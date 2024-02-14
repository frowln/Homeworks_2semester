package org.example;

import java.util.Arrays;

public class ArrayList implements List {
    private Integer[] array = new Integer[10];
    private int size;
    @Override
    public void add(Integer a) throws EmptyElementException {
        if (a == null){
            throw new EmptyElementException();
        } else if (size < array.length){
            array[size++] = a;
        } else {
            Integer[] temp = new Integer[array.length * 2];
            for (int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;
            array[size++] = a;
        }
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index > array.length){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index > size){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
        array = Arrays.copyOf(array, size);
    }

    @Override
    public Integer pop(){
        Integer deletedElement = array[size - 1];
        size--;
        array = Arrays.copyOf(array, size);
        return deletedElement;
    }

}
