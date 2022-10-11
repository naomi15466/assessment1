package com.gnome;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // ask user for their age
        System.out.println("What is your age?");
        int age = in.nextInt();

        double maxHR = 220 - age;   // calculation for your heart rate (220 - age)
        double minHRZone = maxHR * 0.5; // calculation for  minimum HR zone
        double maxHRZone = maxHR * 0.85;   // calculation for maximum HR zone

        System.out.println("Your max heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR Zone is" + " " + minHRZone + " - " + maxHRZone + " beats per minute.");
    }
}
