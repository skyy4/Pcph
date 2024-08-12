package Pcph;

import java.util.*;

public class TryNcatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the value of a: ");
            int a = sc.nextInt();
            if(a<0){
                System.out.println("Invalid");
            }
            else if (a % 2 == 0) {
                System.out.println("a is an even number.");
            } else {
                System.out.println("a is an odd number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong. Please enter a valid integer.");
        }
    }
}

