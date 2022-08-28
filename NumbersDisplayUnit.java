package com.bridgelabday2;
import java.util.Scanner;

public class NumbersDisplayUnit {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        if (x < 10) {
            System.out.println("Entered number's unit is ones");
        } else if (x < 100) {
            System.out.println("Entered number's unit is tens");
        }else if (x < 1000) {
            System.out.println("Entered number's unit is hundreds");
        }else if (x < 100000) {
            System.out.println("Entered number's unit is thousands");
        } else {
            System.out.println("Enter the number.");
        }
    }
}
