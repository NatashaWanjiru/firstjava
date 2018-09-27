/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.n;

/**
 *
 * @author STUDENT
 */
public class CodeN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // system.out.println("")
     int age = 20;
     double weight = 52.0;
     float height = 5.3f;
     String name = "Natasha";
     char gender = 'f';
     boolean healthy = true;
     double bmi = weight/(height*height);
     if(bmi> 20){
         healthy = false;
         
     }
     String secondname = "wanjiru";
     System.out.println("hello my name is "+name+" am "+age+" years old and am healthy");
     System.out.println(name+" "+(secondname));
     int x = 100;
     int y = 20;
     double answer = x / y;
     int c =200;
     int d = 50;
     double multiplication = c*d;
     int e = 20;
     int f =4;
     double addition = e + f;
     int g = 20;
     int h = 7;
     double subtraction = g - h;
    
             
             
     
            
     
     
     
             
     System.out.println(answer);
     System. out.println(multiplication);
     System.out.println(addition);
     System.out.println(subtraction);
     
        // TODO code application logic here
    }
    
}
