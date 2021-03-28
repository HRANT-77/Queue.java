package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue queue1=new Queue();
        queue1.add(5);
        queue1.add(6);
        queue1.add(7);
        queue1.add(8);
        queue1.add(9);
        queue1.add(10);
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1.peek());
        queue1.print();
    }
}
