import java.util.*;
public class BMI{
   public static void enterInfo(){
      System.out.println("Enter next person's information."); //method calling text print
   }
   public static void enterHeight(){
      System.out.println("What is your height in inches?");  // method calling for height
   }
   public static void enterWeight(){
      System.out.println("What is your weight in pounds?");  //method calling for weight
   }
      
     public static void main (String[]args){
      Scanner console = new Scanner(System.in);
         enterInfo();
         enterHeight();
     double height1 = console.nextDouble();
         enterWeight();
     double weight1 = console.nextDouble();
     double bmi1 = (weight1 / (height1 * height1) * 703);
      System.out.println("Person 1 BMI = " +bmi1);
      System.out.println();
      enterInfo();
      enterHeight();
     double height2 = console.nextDouble();
      enterWeight();
     double weight2 = console.nextDouble();
     double bmi2 = (weight2 / (height2 * height2) * 703);
      System.out.println("Person 2 BMI = " +bmi2);
      System.out.println();
      System.out.println("Difference in BMI is: "); 
      System.out.print(bmi1 - bmi2);
      
            
   }
    public static void printMessage( double bmi){  // my attempt at making a method to call a loop to inform user of their BMI range (unsuccesful)
      if (bmi < 18.5){
         System.out.println("Underweight.");
      }else if (bmi < 25){
         System.out.println("Normal.");
      }else if (bmi < 30){
         System.out.println("Overweight.");
      }else{
         System.out.println("Obese.");
      }
   }

   
   
   
}
