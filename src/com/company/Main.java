package com.company;

import java.util.Scanner;

public class Main {

    public static int calculateMonthsUntilPaidOff(double bal, double apr, double pay)
    {
        apr = apr / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + bal / pay * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double bal;
        double apr;
        double pay;

        System.out.print("What is your balance?");
        bal = scan.nextDouble();

        System.out.print("What is the APR on the card (as a percent)?");
        apr = scan.nextDouble();
        apr = apr / 100;

        System.out.print("What is the monthly payment you can make?");
        pay = scan.nextDouble();

        int monthleft = calculateMonthsUntilPaidOff(bal, apr, pay);
        System.out.println("It will take " + monthleft + " months to pay off this card.");





    }
}
