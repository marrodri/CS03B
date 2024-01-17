package FutureInvestment;

import java.awt.*;
import java.lang.Math;
import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {


        double investmentAmount = 5000;
        double annualInterestRate = 3.5;
        double numberOfYears = 5;
        /**
         * getting the user input with the scanner.
         * */

        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Hello and welcome to future investment!\n");
        System.out.print("Please enter the initial investment amount: ");
        investmentAmount = scannerObject.nextDouble();
        System.out.print("Please enter your annual interest rate: ");
        annualInterestRate = scannerObject.nextDouble();

        System.out.print("Please the number of years of your investment: ");
        numberOfYears = scannerObject.nextDouble();


        System.out.println("Calculating your future investment, values entered+++++\n");
        System.out.println("investmentAmount: "+investmentAmount);
        System.out.println("annualInterestRate: "+annualInterestRate);
        System.out.println("numberOfYears: "+numberOfYears);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");



        /**
        * final output.
        * */
        double futureInvestmentValue = investmentAmount * Math.pow((1 + (annualInterestRate / 100)), (numberOfYears));

        System.out.println("Your future profit is: " + futureInvestmentValue);

    }
}
