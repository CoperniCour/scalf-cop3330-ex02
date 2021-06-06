/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 2 - Counting the Number of Characters


package org.example;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        /*Create a program that prompts for an input string and displays output that shows
        the input string and the number of characters the string contains.*/

        //Get input string and create string of Input from user
        Scanner getInput = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String Input = getInput.nextLine();

        //Print out string length
        System.out.print (Input + " has " +Input.length()+ " characters.");

    }


}
