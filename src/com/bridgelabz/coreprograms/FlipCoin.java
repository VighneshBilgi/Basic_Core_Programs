package com.bridgelabz.coreprograms;

import java.util.Scanner;
import java.lang.Math;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of times the coin has to be flipped:");
        double flip = sc.nextInt();
        double rand = 0.0;
        double h = 0.0, t = 0.0;// head counter and tail counter
       double h_perc =0.0, t_perc =0.0;
        if(flip >0.0) {
            for (int i = 0; i < flip; i++) {
                rand = Math.random();
                System.out.println(rand);
                if (rand < 0.5) {
                    t = t + 1;
                } else {
                    h = h + 1;
                }
            }
            h_perc = (h / flip) * 100;
            t_perc = (t / flip) * 100;
            System.out.println("Percentage of Heads is : " + h_perc + "%");
            System.out.println("Percentage of Tails is : " + t_perc + "%");
        }
        else{
            System.out.println("The number must be Positive!");
        }
    }
}