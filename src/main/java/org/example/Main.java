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

    public static int sumSevens(int n1, int n2) { //but where do i define sum..?

        if (n2 == n1) {
            return sum;
        } //Stop at n1 so it's between
        else {
            if (n2 % 7 == 0) {
                sum += n2;
            }
            sumSevens(n2-1); //The Recursive Call
        }
    }

    public static int binSearch(int[] arr, int num) {
        return 0; //placeholder
    }

    public static void main(String[] args) {
        System.out.println("Start:");
        printHello(10);
        //System.out.println(sumSevens(0,28));
    }
}

