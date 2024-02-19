package org.example;

public class Main {

    //Question 1
    public static void printHello(int n) {
        if (n == 0) {} //Stop the recursion at 0: base case
        else {
            System.out.println("Hello World");
            printHello(n - 1); // The Recursive Call
        }
    }

    public static int sumSevens(int n1, int n2) {

        if (n2 == n1-1) {
            return 0;
        } //Stop at n1-1, so it's between INCLUSIVE: base case
        else {
            if (n2 % 7 == 0) {
                return n2+sumSevens(n1,n2-1); //The Recursive Call
            }
        }
        return sumSevens(n1,n2-1);
    }

    public static int binSearch(int[] arr, int num, int b, int e) { //b is beginning of search, e is end

            if (b < 0 || b > arr.length || e<0 || e > arr.length) { //Case 1: found nothing or out of bounds
                return -1;
            } else if (arr[(b+e)/2] == num) { //Case 2: found it in the middle
                return (b+e)/2;
            } else if (arr[(b+e)/2] > num) { //Case 3: middle is greater than num, move down
                if (arr[0]!=num && b==0 && e==1) return -1; //Case 1b: It's not on first element, not found
                else return binSearch(arr,num,b,e-((b+e)/2));
            } else if (arr[(b+e)/2] < num) { //Case 4: middle is less than num, move up
                return binSearch(arr,num,b+((b+e)/2),e);
            }
            return -1;

    }




    public static void main(String[] args) {
        System.out.println("Start:");
        printHello(10);
        System.out.println(sumSevens(7,28));
        int[] arr = {1,2,3,4,5};
        System.out.println("Your number is at index "+binSearch(arr,4,0, 5));
        //binSearch: (array, number to search, beginning (0), end (array length))
    }
}

