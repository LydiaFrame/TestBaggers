/*
 * Program: GetSetBaggers.java
 * Student: Lydia Frame 
 * Purpose: create a program that illustrate the use of public and private access modifiers and illustrates Encapsulation. 
 * This Program will create a bagger class. 
 * You will impute the bagger name, bagger start time, bagger end time, is bagger a minor, bagger break time. Using military time.
*/

import java.util.Scanner; // Import the Scanner class

public class TestBaggers {
		
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
		Scanner input = new Scanner(System.in);

        // Create bagger object
        Baggers bagger1 = new Baggers(null, true, 0, 0, 0);
        //Set values for bagger 1 
        bagger1.setName("Lydia"); 
        bagger1.setIsMinor(false);
        bagger1.setStartTime(8);
        bagger1.setEndTime(16);
        bagger1.setBreakTime(12);
        //Get bagger 1
        System.out.println("Bagger name: " + bagger1.getName());
        System.out.println("Is bagger a minor: " + bagger1.getIsMinor());
        System.out.println("Bagger start time: " + bagger1.getStartTime());
        System.out.println("Bagger end time: " + bagger1.getEndTime());
        System.out.println("Bagger break time: " + bagger1.getBreakTime());

        // Space between objects
        System.out.println();

        // New bagger object
        Baggers bagger2 = new Baggers(null, true, 0, 0, 0);
        System.out.println("Bagger name: " + bagger2.getName());
        System.out.println("Is bagger a minor: " + bagger2.getIsMinor());
        System.out.println("Bagger start time: " + bagger2.getStartTime());
        System.out.println("Bagger break time: " + bagger2.getBreakTime());

        // Space
        System.out.println();

        // Print out number og baggers
        System.out.println("Total number of baggers: " + Baggers.totalBaggers);
        
        // Close the scanner to prevent resource leaks
        input.close();
    }
}