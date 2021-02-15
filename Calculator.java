/**
*Program: Calculator
*This: Calculator.java
*Author: Stephanie Gomez
*Professor: Dr. Rafeeq Al-Hashemi
*Date: February 13, 2021
*Purpose: This program will take input from the user as a string and then take away
*         any whitespaces, read and then calculate the solution.
*/

package calculator;
import java.util.Scanner;

public class Calculator 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //This will have the users input
        String stringMath;
        
        System.out.println("Please enter a single digit math problem. Ex: 3 + 4.");
        stringMath = input.nextLine();
        
        //This will replace all the spaces in the string with no spaces
        stringMath = stringMath.replace(" ", "");
        
        //This will print out the new string with no spaces
        System.out.println(stringMath);
        
        //This will check if the length of the string is 3
        if(stringMath.length() !=3)
        {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }
        
        //This is an array to take in the string and split it into separate "words" so that
        //each "word" will be in its own index in the array
        String [] newString = stringMath.split("");
        
        //This will be the result of the two numbers that are entered by the user
        int result = 0;
        
        switch(newString[1].charAt(0))
        {
            case '+':
            {
                result = Integer.parseInt(newString[0]) + Integer.parseInt(newString[2]);
                break;
            }
            case '-':
            {
                result = Integer.parseInt(newString[0]) - Integer.parseInt(newString[2]);
                break;
            }
            case '*':
            {
                result = Integer.parseInt(newString[0]) * Integer.parseInt(newString[2]);
                break;
            }
            case '/':
                result = Integer.parseInt(newString[0]) / Integer.parseInt(newString[2]);
                break;
        }
       

        System.out.println(newString[0] + " " + newString[1] + " " + newString[2] + " = " + result);
    }
    
}
