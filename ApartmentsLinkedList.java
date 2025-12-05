/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apartment;

/**
 *
 * @author bearb
 */

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class ApartmentsLinkedList {
    public static void main(String[] args) {
        LinkedList<Apartment> apartments = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        // Ask for the first street address
        System.out.print("Enter Street Address (or -1 to stop): ");
        String street = input.nextLine();

        // Loop continues until user enters -1 for street
        while (!street.equals("-1")) {
            System.out.print("Apartment Number: ");
            String number = input.nextLine();

            System.out.print("Monthly Rent: ");
            double rent = Double.parseDouble(input.nextLine());

            System.out.print("Number of Bedrooms: ");
            int bedrooms = Integer.parseInt(input.nextLine());

            // Add apartment to LinkedList
            apartments.add(new Apartment(street, number, rent, bedrooms));

            // Ask for next street address
            System.out.print("\nEnter Street Address (or -1 to stop): ");
            street = input.nextLine();
        }

        // Sort apartments by rent
        Collections.sort(apartments);

        // Display sorted apartments
        System.out.println("\nSorted Apartments by Rent:");
        for (Apartment apt : apartments) {
            System.out.println(apt);
        }

        input.close();
    }
}
