package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String fullName = input.nextLine().trim();
        int spaceIndex = fullName.indexOf(" ");
        int lastSpace = fullName.lastIndexOf(" ");

        String firstName = fullName.substring(0,spaceIndex);
        String middleName = fullName.substring(spaceIndex +1,lastSpace);
        String lastName = fullName.substring(lastSpace +1);

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);


    }
}
