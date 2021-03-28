package com.company;

public class Queue {
    private int[] array = new int[0];

    public void add(int element) {
        int[] array1 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array1[array.length] = element;
        array = array1;
    }

    public int peek() {
        if (array.length == 0) {
            System.out.println("Queue is empty");
            return 0;
        }
        return array[array.length - 1];
    }

    public int poll() {
        if (array.length == 0) {
            System.out.println("Queue is empty");
            return 0;
        }
        int[] array1 = new int[array.length - 1];
        int lastElement = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++)
            array1[i] = array[i];
        array = array1;
        return lastElement;
    }

    public void print() {
        if (array.length == 0) {
            System.out.println("Queue is empty");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                System.out.println();
            }
        }
    }
}
