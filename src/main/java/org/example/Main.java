package org.example;

public class Main {

    //Question 1
    public static void printHello(int n) {
        if (n == 0) {} //Stop the recursion at 0
        else {
            System.out.println("Hello World");
            printHello(n - 1); // The Recursive Call
        }
    }

    public static int sumSevens(int n1, int n2) {

        if (n2 == n1-1) {
            return 0;
        } //Stop at n1-1 so it's between INCLUSIVE
        else {
            if (n2 % 7 == 0) {
                return n2+sumSevens(n1,n2-1); //The Recursive Call
            }
        }
        return sumSevens(n1,n2-1);
    }

    public static int binSearch(int[] arr, int num) {
        return 0; //placeholder
    }

    public static void main(String[] args) {
        System.out.println("Start:");
        //printHello(10);
        System.out.println(sumSevens(7,28));
    }
}

