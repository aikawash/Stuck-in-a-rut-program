/**
*Title: Are you stuck in a RUT?
*@author Aika Washington
*@since 04 October 2017
*@version 1.0
*Description: This program is programmed to ask the user their name and certain values that will allow the program to calculate their
*  Rut score, which will allow them to determine if they are stuck in a rut. It includes another class, Calculator, as well as
*  a tester file called CalculatorTester.

*Honor Code: On my honor, I have neither given nor received any unauthorized aid on this assignment. Aika Washington  
*/


/** 
*Importing Math package.
*/
import java.lang.Math; 
/** 
*Importing Scanner package.
*/
import java.util.Scanner; 

/**
*creating a class that can hold the variables for the rut score, use methods from the calculator class, and print the rut score
*/

public class RUTCalculator

{ 
   public static void main(String[] args)
   {
      /**
      *Creating a new Scanner object to read keyboard input.
      */
      Scanner rut = new Scanner(System.in); 
      /**
      * Prompts the user for input of their name.
      */
      Calculator rutscore = new Calculator (); 
      
      System.out.println("Hello! Please enter whole numbers only when prompted for a number. :)");
      System.out.print("Please type your first name: "); 
      /**
      *Defining a variable to hold the name input.
      */
      String name = rut.next(); 
      /**
      *Prompts user for input of level of routiness in their morning.
      */
      System.out.print("\nDetail level in describing your morning routine (1-10, with 10 being \"at 6:43 I will pluck nose hair\": "); 
      /**
      * Defining a variable D to hold input of how routine user's morning is. 
      */
      int D = rut.nextInt(); 
      /**
      * Prompts user for input of the time this week user spent working, sleeping, and watching TV.
      */ 
      System.out.print("\nTotal time this week spent doing the following things: working, sleeping, watching TV: "); 
      /**
      * Defining a variable Tw to hold the time this week user spent working, sleeping, and watching TV.
      */
      int Tw = rut.nextInt(); 
      /**
      * Prompts user for input of time spent last week working, sleeping, and watching TV.
      */
      System.out.print("\nTotal time last week spent working, sleeping, and watching TV: ");
      /**
      * Defining a variable Tw for input of the time spent last week working, sleeping, and watching TV.
      */
      int Tl = rut.nextInt();
      /**
      *Prompts user for input of how many weeks in a row user has more or less duplicated the Tl and Tw values.
      */
      System.out.print("\nHow many weeks in a row have you duplicated what you did this week and the week before?: ");
      /**
      *Defining a variable Tt for input of how many weeks in a row user has more or less duplicated the Tl and Tw values.
      */
      int Tt = rut.nextInt();
      /** 
      *Prompts the user for input of how many times they have done something unexpected in the past year.
      */
      System.out.print("\nIn the past year, how many times have you done something completely unexpected?: ");
      /**
      *Defining a variable U for number of times user has don something unexpected in the past year.
      */
      int U = rut.nextInt();
      /**
      *Prompts the user for input of how many new hobbies or interests user has explored in depth in the past five years.
      */
      System.out.print("\nIn the past five years, how many new hobbies or interest have you explored somewhat in depth?: ");
      /**
      *Defining a variable H for how many new hobbies or interests user has explored in depth in the past five years.
      */
      int H = rut.nextInt();
      /**
      *Prompts the user for how many new places they have been in the last month.
      */
      System.out.println("\nHow many new places have you been in the past month? Include new restaurants, theater, etc.: ");
      /**
      *Defining a variable N for how many new places the user has went.
      */
      int N = rut.nextInt();
      /**
      *Prompts the user for how many times they have been out of state for non business purposes in the past year.
      */
      System.out.print("\nIn the past year, how many times have you been out of the state for non-business purposes?: ");
      /**
      *Defining a variable S for how many times the user has been out of state for non business purposes in the past year.
      */
      int S = rut.nextInt();
      /**
      *Prompts the user for how many times they have been out of the country for non business purposes in the past year.
      */
      System.out.print("\nIn the past year, how many times have you been out of the country for non-business purposes?: "); 
      /**
      *Defining a variable C for how many times the user has been out of the state for non business purposes in the past year. 
      */
      int C = rut.nextInt();
      /**
      calling a method to get the rut score from the calculator class
      */
      double rutScoreValue = rutscore.rutscoreout(D,Tw,Tl,Tt,U,H,N,S,C);
      System.out.print("\n\nHello " +name+", your Rut value is "); 
      System.out.printf("%.2f. If this value is greater than 1.00, then you are officially \"stuck in a rut\".",rutScoreValue);
      System.out.println("\n\n ***END RUN***");
      
      
      
   }
}