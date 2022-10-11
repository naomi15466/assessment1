package com.gnome;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        // getting user input
        System.out.println("Enter the name of your dog: ");
        String dogName = in.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here!");

        // create an array to store dog breed types
        String[] dogBreed = {"St. Bernard","Chihuahua","Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};

        // declare variables for 5 random percentages
        // subtract bound so that total can add up to 100
        int percent1 = random.nextInt(101);
        int percent2 = random.nextInt(101-percent1);
        int percent3 = random.nextInt(101-percent2-percent1);
        int percent4 = random.nextInt(101-percent3-percent2-percent1);
        int percent5 = random.nextInt(101-percent4-percent3-percent2-percent1);

        // total percentage of all the breeds added together
        int total = percent1 + percent2 + percent3 + percent4 + percent5;

        // create array for random percentages
        int[] breedPercent = {percent1,percent2, percent3, percent4, percent5};

        System.out.println(dogName + " "+  "is:\n");

        // loop through and have it generate random percentage for each dog breed in the array
        for(int i = 0; i < 5; i++){
            System.out.println( breedPercent[i] + "%" + " " + dogBreed[i]);
        }

        System.out.println("Total percentage: " + total + "%");
        System.out.println("Wow, that's QUITE the dog!");
    }
}
