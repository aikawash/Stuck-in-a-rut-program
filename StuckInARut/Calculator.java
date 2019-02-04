/**
*Title: Are you stuck in a RUT?
*@author Aika Washington
*@since 04 October 2017
*@version 1.0
*Description: This program is programmed to ask the user their name and certain values that will allow the program to calculate their
*  Rut score, which will allow them to determine if they are stuck in a rut.
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


public class Calculator { 
/**
*default constructor does nothing since there are no instance variables to speak of
*/
   public Calculator() {}  

/**
* numerator made up of multiple tasks
* @param D  time this week user spent working, sleeping, and watching TV.
* @param Tw time spent last week working, sleeping, and watching TV.
* @param Tl how many weeks in a row user has more or less duplicated the Tl and Tw values.
* @param Tt input of how many times they have done something unexpected in the past year.
* @return returns the entire value of the numerator
*/
   public double numerator(int D, int Tw, int Tl, int Tt) 
   {
      double result = 10*D*(part1(Tt,Tw,Tl));
      
      return result;
   } 
/**
* numerator's parenthesis
* @param Tw time spent last week working, sleeping, and watching TV.
* @param Tl how many weeks in a row user has more or less duplicated the Tl and Tw values.
* @param Tt input of how many times they have done something unexpected in the past year.
* @return return 5 plus the value of the radical
*/
   public double part1(int Tt, int Tw, int Tl) 
   {
      double result = (5 + Math.sqrt(part2(Tt,Tw,Tl)));
   
      return result;
   
   } 
/**
* value inside numerator's square root
* @param Tw time spent last week working, sleeping, and watching TV.
* @param Tl how many weeks in a row user has more or less duplicated the Tl and Tw values.
* @param Tt input of how many times they have done something unexpected in the past year.
* @return returns the value of the radical
*/
   public double part2(int Tt, int Tw, int Tl)
   {
      double result = Math.pow(Tt, part3(Tw, Tl));
      
      return result;
   } 
/**
* exponent inside the square root 
* @param Tw time spent last week working, sleeping, and watching TV.
* @param Tl how many weeks in a row user has more or less duplicated the Tl and Tw values.
* @return returns the value of the exponenet inside the square root
*/
   public double part3(int Tw, int Tl) 
   {
      double result = 4- 0.5*(Math.abs(Tw-Tl));
      
   
      return result;
   } 

/** 
* denominator is made up of multiple pieces
* @param U  how many new hobbies or interests user has explored in depth in the past five years.
* @param H  how many new hobbies or interests user has explored in depth in the past five years.
* @param N  how many times they have been out of state for non business purposes in the past year.
* @param S  how many times they have been out of the country for non business purposes in the past year.
* @param C  how many times the user has been out of the state for non business purposes in the past year.
* @return returns the entire value of the denominator

*/
   public double denominator(int U, int H, int N, int S, int C) 
   {
      double result = U*H* part4(N,S,C);
      
      return result; 
   
   }
/** 
*outermost parenthesis
* @param N  how many times they have been out of state for non business purposes in the past year.
* @param S  how many times they have been out of the country for non business purposes in the past year.
* @param C  how many times the user has been out of the state for non business purposes in the past year.
* @return returns the value of all the calculations inside the parenthesis of the denominator
*/
   public double part4(int N, int S, int C) 
   {
      double result = N + S + part5(C);
      
   
      return result;
   
   }
/**
* innermost parenthesis
* @param C  how many times the user has been out of the state for non business purposes in the past year.
* @return returns the value of the numbers inside the inner set of parenthesis
*/
   public double part5(int C) 
   {
      double result = Math.pow((C+1), 2);
      
      return result;
   
   }
   
/**
* creating a new rut score method
* @param D  time this week user spent working, sleeping, and watching TV.
* @param Tw time spent last week working, sleeping, and watching TV.
* @param Tl how many weeks in a row user has more or less duplicated the Tl and Tw values.
* @param Tt input of how many times they have done something unexpected in the past year.
* @param U  how many new hobbies or interests user has explored in depth in the past five years.
* @param H  how many new hobbies or interests user has explored in depth in the past five years.
* @param N  how many times they have been out of state for non business purposes in the past year.
* @param S  how many times they have been out of the country for non business purposes in the past year.
* @param C  how many times the user has been out of the state for non business purposes in the past year.
* @return returns the entire value of the rut score
*/
   public double rutscoreout (int D, int Tw, int Tl, int Tt,int U, int H, int N, int S, int C)
   {
      double result = numerator(D,Tw,Tl,Tt)/denominator(U,H,N,S,C);
    
   
      return result; 
   }

}
 


