package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

Scanner scanner = new Scanner(System.in);
    {
        System.out.println("Enter number 1: ");

        System.out.println("Enter first number:");

        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");

        double num2 = scanner.nextDouble();
        System.out.println("Choose an operator: +, -, *, /");

        char operator = scanner.next().charAt(0);

//        Example: A $53,000 loan at 7.625% interest for 15 years would have a $495.09 /
//        mo payment with a total interest of $36,115.99
//        This calculator would use a compounded interest formula.

        // Inputs
        // initial loan - 53,000
        // rate - 7.625
        // loanLength - 15 years

        // P is 53,000
        // i is .07625/12 (.006354166)
        // l is 15*12 (180 months)

        float initialLoan = 53_000;
        float rate = 7.625f;
        float loanLength = 15;

        float monthlyRate = rate/12/100;
        float monthlyLoanLength = loanLength*12;

        double monthlyPayment = initialLoan*(monthlyRate/(1-(Math.pow(1+monthlyRate, -monthlyLoanLength))));

        double totalInterest = monthlyPayment*monthlyLoanLength - initialLoan;
        System.out.printf("Monthly Payment: $%.2f, Total Interest: $%.2f", monthlyPayment, totalInterest);

        // Outputs
        // monthly payment - 495.09
        // total interest - 36,115.99







    }

//  Example: A deposit of $1000 loan in a CD that earns 1.7% intrest matures in 5yrs /
//   CD ending balance $1092.62, $92.62 in intrest
//   Either a CD calculator would be needed or a future value calculator.
//   Future Value (FV) = PV x (1+r)n
    // PV = $1000
    // r = 1.7%
    // n = 5yrs
// PV = 1000 x (1+ 1.7%)5 annual compounding = 1x



//   Code for CD calculator:



import java.util.Scanner;

    public class CDCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (as a percentage): ");
            double interestRate = scanner.nextDouble() / 100;

            System.out.print("Enter the number of years: ");
            int years = scanner.nextInt();

            // Calculate the CD maturity value
            double maturityValue = calculateMaturityValue(principal, interestRate, years);

            // Display the result
            System.out.printf("The maturity value of the CD is: $%.2f\n", maturityValue);

            scanner.close();
        }

        private static double calculateMaturityValue(double principal, double interestRate, int years) {
            double maturityValue = principal * Math.pow(1 + interestRate, years);
            return maturityValue;
        }







}
    
}
