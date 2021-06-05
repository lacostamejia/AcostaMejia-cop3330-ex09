/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

import java.util.*;
import java.lang.Math; // Here we are declaring this to use Math.round();
/*You will need to purchase 2 gallons of paint to cover 360 square feet.

 */
public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner method called
        // 1 Gallon = 350 feet
        int length;
        int width;

        System.out.print("Insert the length: ");
        length = in.nextInt();

        System.out.print("Insert the width: ");
        width = in.nextInt();

        int area = length * width; //Here we are finding the total area of the room
        double gallon = (0.00285714285); //Here is the conversion rate of the equivalent from 1 gallon to square feet.

        double total_gallons = Math.ceil(area/350); //Here we are finding the total gallons needed, and we rounded.

        System.out.println("You will need to purchase " + total_gallons + " gallons of paint to cover " + area + " square feet");
    }
}
