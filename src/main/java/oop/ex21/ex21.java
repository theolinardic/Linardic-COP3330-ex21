/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 21 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex21;
import java.util.Scanner;

public class ex21 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int month = userInputScanner.nextInt();
        String monthFinal;

        switch(month){
            case 1:
                monthFinal = "January";
                break;
            case 2:
                monthFinal = "February";
                break;
            case 3:
                monthFinal = "March";
                break;
            case 4:
                monthFinal = "April";
                break;
            case 5:
                monthFinal = "May";
                break;
            case 6:
                monthFinal = "June";
                break;
            case 7:
                monthFinal = "July";
                break;
            case 8:
                monthFinal = "August";
                break;
            case 9:
                monthFinal = "September";
                break;
            case 10:
                monthFinal = "October";
                break;
            case 11:
                monthFinal = "November";
                break;
            case 12:
                monthFinal = "December";
                break;
            default:
                monthFinal = "NOT VALID MONTH";
        }

        System.out.print("The name of the month is " + monthFinal + ".");

    }

}
