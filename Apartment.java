/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apartment;

/**
 *
 * @author bearb
 */

public class Apartment implements Comparable<Apartment> {
    private String streetAddress;
    private String apartmentNumber;
    private double monthlyRent;
    private int bedrooms;

    // Constructor
    public Apartment(String streetAddress, String apartmentNumber, double monthlyRent, int bedrooms) {
        this.streetAddress = streetAddress;
        this.apartmentNumber = apartmentNumber;
        this.monthlyRent = monthlyRent;
        this.bedrooms = bedrooms;
    }

    // compareTo method for sorting by rent
    @Override
    public int compareTo(Apartment other) {
        return Double.compare(this.monthlyRent, other.monthlyRent);
    }

    // toString method
    @Override
    public String toString() {
        return "Apartment " + apartmentNumber + " at " + streetAddress +
               " | Rent: $" + monthlyRent +
               " | Bedrooms: " + bedrooms;
    }
}