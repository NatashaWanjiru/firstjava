/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class week5 {
  
 public static void main(String[] args) {
     
//every method has its own curlybrackets  
//THREE TYPES OF METHOD
//1.VOID
//2.RETURN- WILL RETURN BASED ON THE DATATYPE YOU GIVE EXA.FLOAT
//3.EITHER RETURN TYPE OR VOID METHOD THAT ALLOWS PASSING OF PARAMETERS


//ACCESS METHODS/KEYWORDS
//1. PUBLIC ACCESS - MAKES A CLASS OR VARIABLE OR METHODS ACCESSIBLE ANYWHERE IN THE PROJECT
//2.PRIVATE ACCESS - MAKES A CLASS OR VARIABLE OR METHODS ACCESSIBLE ONLY WITHIN THE SAME CLASS WHERE THEY ARE DEFINED
//THE NAME DOES DEFINE THE OUTCOME.
//calling is done on the previous method
calculateage();
name();
} 
 public static  void calculateage(){
   int birthdate = 1998;   
   int today = 2018;
   int age = today - birthdate;
   System.out.println("age is " +age);
           
 } 
 public static String name(){
     String name= "NATASHA";
             return name;
 }
 
}
