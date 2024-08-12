package Pcph;

import java.util.*;

    public class Fibonacci {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter the value for N: ");
                int N = sc.nextInt();

                if (N > 10) {
                    System.out.println("Input value should not exceed 10.");
                    return; // Exit the program
                }

                System.out.println("Fibonacci Series up to " + N + ":");
                int num1 = 0, num2 = 1;
                System.out.print(num1 + " " + num2 + " ");

                for (int i = 2; i < N; i++) {
                    int nextTerm = num1 + num2;
                    System.out.print(nextTerm + " ");
                    num1 = num2;
                    num2 = nextTerm;
                }
            } catch (Exception e) {
                System.out.println("Something went wrong. Please enter a valid integer.");
            }
        }
    }


