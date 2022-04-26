package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class Factors {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = sc.nextInt();

        System.out.println("The prime factors of the number are:");
        for(int i = 2; i< num; i++) {
            while(num%i == 0) {
                System.out.println(i+" ");
                num = num/i;
            }
        }

        if(num >2) {
            System.out.println(num);
        }
    }
}