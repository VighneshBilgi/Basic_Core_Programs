package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("1st number will be divided by 2nd number");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        int q = num1/num2;
        int r = num1%num2;
        System.out.println("Quotient is : "+ q);
        System.out.println("Quotient is : "+ r);
    }
}
