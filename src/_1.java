// Complete the function printNumber which takes an integer input from the user and prints it on the screen.


import java.util.Scanner;

public class _1 {
    public void printNumber(Scanner sc) {
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        System.out.println(n);
    }

    public void main(String[] args) {
        _1 obj = new _1(); // Creating an object of _1 class
        Scanner sc = new Scanner(System.in);
        obj.printNumber(sc);
    }
}
