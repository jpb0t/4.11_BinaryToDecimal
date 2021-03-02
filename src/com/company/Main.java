package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables:
        String binaryUserInput;
        double decimalConversion;
        int a = 1;
        int b = 1;
        int c = 0;
        int d = 0;

        //Block 1: User input
        System.out.println("Please enter a four digit binary number within the" +
                "range of 0000-1111: ");
        binaryUserInput = input.next();

        //Block 2: Finding placement of UI and equation
        decimalConversion = Integer.parseInt(binaryUserInput, 2);

        System.out.println(decimalConversion);

        //decimalConversion = a * Math.pow(2, 3) + b * Math.pow(2, 2) + c * Math.pow(2, 1) +
        //+ d * Math.pow(2, 0);
        //System.out.println(decimalConversion);

    }
}

/* So, I kinda cheated on this one. I originally wanted to find the placement of the UI number through
charAt, but it wouldn't work because of an error. Then I thought about converting the UI ASCII code into
the numerical values and then applying my math, but that felt too complicated. I looked online and found
the Integer.parseInt method and just used that. I get the formula (kinda) but I don't know why it works
the way it works. Below is my pseudo code, which I thought would work wonderfully:

Scanner input = new Scanner (System.in);

//Variables:
int binaryUserInput;
int decimalConversion;
int a;
int b;
int c;
int d;

//Equation:
a = binaryUserInput.charAt(0)
b = binaryUserInput.charAt(1)
c = binaryUserInput.charAt(2)
d = binaryUserInput.charAt(3)

decimalConversion = Math.pow(a, 3) + Math.pow(b, 2) + Math.pow(c, 1) + Math.pow(d, 0);

System.out.println("The decimal value for the binary number you input is: " + decimalConversion);
*/


/*
(Binary to decimal) Write a program that prompts the user to enter binary digits
and displays its corresponding decimal value.
*/