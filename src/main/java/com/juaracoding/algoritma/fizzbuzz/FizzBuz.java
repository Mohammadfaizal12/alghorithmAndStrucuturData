package com.juaracoding.algoritma.fizzbuzz;

public class FizzBuz {

    public static void fizzBuzz(int total) {
        for (int i = 1; i <= total ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        fizzBuzz(100);
    }
}
