package com.nicoselomin.day_4;

import java.util.Locale;
import java.util.Scanner;

public class CompoundInterestCalculator {
    static void main(String[] args) {
        // Create Scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("=== Compound Interest Calculator ===");

        // Prompt and read principal, rate, time (years)
        System.out.println("Enter principal amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.println("Enter annual interest rate (as decimal): ");
        double interest = scanner.nextDouble();

        System.out.println("Enter time period (years): ");
        double time = scanner.nextDouble();

        // Compute finalAmount = principal * Math.pow(1 + rate, time)
        double finalAmount = principalAmount * Math.pow(1 + interest, time);

        // Compute interestEarned = finalAmount - principal
        double interestEarned = finalAmount - principalAmount;

        // Print results with 2 decimal places
        System.out.printf("Final Amount: $%.2f\n", finalAmount);

        System.out.printf("Interest Earned: $%.2f\n", interestEarned);

        scanner.close();

    }
}
