
package finalprojectt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;


public class Finalprojectt extends Person {

   public static void main(String[] args) throws IOException {
      
     Scanner scan = new Scanner(System.in);   
        
        //Creating a File
        File file = new File("data.txt");
     
        //variables
        int input;
        String gender;
        char genderChar ='A';
        
        System.out.println("\t##### Welcome #####");

        //Start of the program
        while (genderChar =='A'|| genderChar =='B'&& genderChar !='C' ) {   
        
        
            
        System.out.println("Please select one from these option:");
        System.out.println("A: To enter a new client.");
        System.out.println("B: To read data from the file.");
        System.out.println("C: To exit the program.");
        
        gender = scan.nextLine().toUpperCase();
        genderChar = gender.charAt(0);
        
        //While loop if unvalid answer entry was submitted.
        while(genderChar != 'A' && genderChar != 'B' && genderChar != 'C'){
        System.out.println("Wrong entry! Please enter one of the three options above.");
        gender = scan.nextLine().toUpperCase();
        genderChar = gender.charAt(0);
        }
        

       
        //switch
        switch(genderChar)
           { case'A':
      //  if the entry genderChar == 'A')
            
            Person person1 = new Person();

        // taking user info
        //Askin the user for his information    
        String  s = (String)securedInput("Hello Please enter your first name:","string",10);
        person1.set_name(s);
        
        //Male or Female?
        System.out.println("What is your gender? (M for Male and F for Female): ");
        gender = scan.nextLine().toUpperCase(); 
        genderChar = gender.charAt(0);
        
        //Informing the user of a wrong entry and asking him to enter a valid one
        while (genderChar !='M' && genderChar !='F' ){
            System.out.println("Wrong entry! Please enter M for Male or F for Female:");
            gender = scan.nextLine().toUpperCase(); 
            genderChar = gender.charAt(0);
        }
        person1.set_gender(genderChar);

        //Age?
        System.out.println("What is your age: ");
        input = scan.nextInt();
        person1.set_age(input);

        //Weight?
        System.out.println("What is your weight in Kg: ");
        input = scan.nextInt();
        person1.set_weight(input);

        //Height?
        System.out.println("What is your height in cm: ");
        input = scan.nextInt();
        person1.set_height(input);
        
        //Determining your BMR 
        person1.set_Bmr(person1.get_height(),person1.get_weight(),person1.get_age(), person1.get_gender());
        
        //creating new Object
        Person person3 = new Person("Abdulraman",167,65,19,'M', 1600.2 ,2900.1,2);


        //prompet: Level of Exercises
         System.out.println("What is your level of exercise? ");
         System.out.println("Type in 0 if you do not exercise. ");
         System.out.println("Type in 2 if you engage in light exercise one to three days a week.");
         System.out.println("Type in 3 if you do exercise moderately three to five times a week.");
         System.out.println("Type in 4 if you do intensely six to seven days a week.");
         System.out.println("Type in 5 if you do exercise intensely six to seven days a week and have a physically active job.");

        input = scan.nextInt();
        person1.set_exercise(input);
        
        // Determning user Caloreis
        person1.set_Cal(person1.get_bmr(), person1.get_exercise());
        
        
        FileWriter fw = new FileWriter (file);
        PrintWriter print = new PrintWriter(fw); 

        
        
        System.out.println("                   *************Users information is :*************\n");
        print.printf("%-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s","level of exersize","Caloreis","BMR","weight","height","gender","age","name\n");
         System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s","level of exersize","CALoreis","BMR","weight","height","gender","age","name\n");
        
         //printing users info to file 
         print.println(person1);
        print.println(person3);
        //printing users info to console
        System.out.println(person1);
        System.out.println(person3);
        
         print.close(); //Close file
         
         break; // end of option A
         
          //Option B read data from file
                case 'B':
            if (file.length() == 0) {
      System.out.println("File is empty ...");
            }
            
            else{
            Scanner scani = new Scanner(file);
            while(scani.hasNextLine()){
            System.out.println(scani.nextLine()); 
            }//end of while
           
            }//end of else
            break;//end of case B
        }//end of switch
        
        
      
    }// end of while
        
          //If c is selected the program ends.
          if(genderChar == 'C'){ 
            
            System.out.println("Thank you for using our operating system");
        }
          
}//end of main
   
   //method to limit the user name info
    public static Object securedInput(String intro, String type, int maxLength)
{
    //Apply Scanner
    Scanner input = new Scanner(System.in);
    
    //Show intro
    if(intro != null)
        System.out.print(intro+" ");
    
    //Get user's input
    String  inStr = input.next(); //always get a string
    
    //Enforce length
    if((maxLength>0)&&(inStr.length() > maxLength))
        inStr = inStr.substring(0, maxLength);
    
    String  result;
    
    if(inStr == null || inStr.length() < 1)
        return null;
    
    switch (type)
    {
            case "string" -> {
                result = inStr.replaceAll("[^a-zA-Z .-]", "");
                if(result.length() < 1 || result.length() < inStr.length())
                    return null;
                else
                    return result;
            }
            default -> {
                    return null;
            }
    }//end of switch
           
}//end of method
}//end of class
