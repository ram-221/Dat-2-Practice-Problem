package com.bridgelabday2;
import java.util.Scanner;

public class PalindromeNumber {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number : ");
	        int x = sc.nextInt();
	        int y = x;
	        int remainder = 0;
	        int reverse = 0;
	        for (;y != 0;) {
	            remainder = y % 10;
	            reverse = reverse * 10 + remainder;
	            y=y/10;
	        }
	        if (x==reverse){
	            System.out.println("Entered number is a palindrome.");
	        }else {
	            System.out.println("Entered number is not a palindrome.");
	        }
	    }

}
