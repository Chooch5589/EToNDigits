package com.mattrios;

import java.util.Scanner;

public class Main {

        public static Scanner sc = new Scanner (System.in);

        public static void main(String[] args) {
            System.out.println("This application will return e to a suggested number of decimal digits.");
            System.out.println("Please enter the number of decimal digits (0-15) to return:");

            int digits = 16;
            while(digits < 0 || digits > 15) {
                try {
                    digits = sc.nextInt();
                } catch (Exception e) {
                    sc.nextLine();
                }
                if (digits < 0 || digits > 15) {
                    System.out.println("Please enter a valid value (0-15)");
                }
            }

            String format = "%." + digits + "f";

            System.out.println(String.format(format, Math.E));
        }
}
