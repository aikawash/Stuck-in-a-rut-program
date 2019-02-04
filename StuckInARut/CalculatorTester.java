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


public class CalculatorTester
{
   public static void main(String []args)
   {
      /**
      * creating a new object to test the Calculator class
      */
      
      Calculator tester = new Calculator();
     
      /**
      * declaring and assigning variables
      */
      
      int D = 2;
      int Tw = 144;
      int Tl = 144;
      int Tt = 0;
      int U = 5;
      int H = 3;
      int N = 1;
      int S = 5;
      int C = 1;
      
      /**
      * calling part 1 to test the expected versus the actual value
      */
      
      double part1 = tester.part1(Tt,Tw,Tl);
      System.out.printf("\npart1\n\tExpected value:5.00\n\tActual value:%.2f",part1);
      
      double part2 = tester.part2(Tt,Tw,Tl);
      System.out.printf("\npart2\n\tExpected value:0.00\n\tActual value:%.2f",part2);
      
      double part3 = tester.part3(Tw, Tl);
      System.out.printf("\npart3\n\tExpected value:4.00\n\tActual value:%.2f",part3);
      
      double denominator = tester.denominator(U,H,N,S,C);
      System.out.printf("\ndenominator\n\tExpected value:150.00\n\tActual value:%.2f",denominator);
   
      double part4 = tester.part4(N,S,C);
      System.out.printf("\npart4\n\tExpected value:10.00\n\tActual value:%.2f",part4);
      
      double part5 = tester.part5(C);
      System.out.printf("\npart5\n\tExpected value:4.00\n\tActual value:%.2f",part5);
         
      double numerator = tester.numerator(D,Tw,Tl,Tt);
      System.out.printf("\nnumerator\n\tExpected value:100.00\n\tActual value:%.2f",numerator);
      
      double rutScoreValueTest = tester.rutscoreout(D,Tw,Tl,Tt,U,H,N,S,C);
      System.out.printf("\nrutScoreValueTest\n\tExpected value:0.67\n\tActual value:%.2f",rutScoreValueTest);
         
         
   
      
      
   }
    
}   
  
