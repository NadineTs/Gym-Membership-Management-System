/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author hp
 */
public class GymDemo {
   
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        int choice;
        int selection;
        int numC = 1;
        String name;
        int age;
        String id;
        String phoneNumber;
        int months;
      
        //create an object for each class
        YearlyMembership yearlyM = new YearlyMembership("Swimming and Yoga",400);
        
        MonthlyMembership monthly3 = new MonthlyMembership("Swimming",3,200);
        MonthlyMembership monthly6 = new MonthlyMembership("Swimming",6,200);
         
        GymMembership gym = new GymMembership();
        
        Scanner keyboard = new Scanner(System.in);
        
        ArrayList<String> customer = new ArrayList<>();
        customer.add(0, "Gym Member are:");
        
        PrintWriter outputfile = new PrintWriter("Gym.txt");
        
        File file = new File("menu.txt");
        Scanner inputfile = new Scanner(file);
        
        System.out.println("\t***** Welcome To Fitness Gym *****"
                + "\nFirst, enter your informations to see our subscription menu.\n");
     
       
       do{
             gym.memberID();
                
                System.out.printf("^^Hello customer %d^^\n" , numC);//get the customer informations
                
            
               System.out.print("Enter your name: ");
               name = keyboard.nextLine();
               customer.add(String.format("%d- "+name, numC));
               
               
               System.out.print("Enter your ID number(10 numbers): ");
               id = keyboard.nextLine();
               while(id.length() != 10){
                    System.out.print("Worng! Try again.\nPlease, enter your ID number(10 numbers): ");
                    id = keyboard.nextLine();
                }
     
                System.out.print("Enter your age(allowed between age 7-70 years): ");
                age = keyboard.nextInt();
                while(age<7 || age>70){
                    System.out.print("Worng! Try again.\nPlease, enter your age(allowed between age 7-70 years): ");
                    age = keyboard.nextInt();
                }
                keyboard.nextLine();
                System.out.print("Enter your phone number(10 numbers): ");
                phoneNumber = keyboard.nextLine();
        
                while(phoneNumber.length() != 10){
                    System.out.print("Worng! Try again.\nPlease, enter your phone number(10 numbers): ");
                    phoneNumber = keyboard.nextLine();
                }
                System.out.println("");
                
                //the subscription menu in the
            do{    
        /*System.out.println("Choose from this menu(enetr 1-3)");
        System.out.println("1- change member information.");
        System.out.println("2- subscribe in monthly membership. (only swimming class for 3 or 6 months) ");
        System.out.println("3- subscribe in yearly membership. (yoga and swimming class and many offers! )");*/
        while(inputfile.hasNext()){
            String str = inputfile.nextLine();
            System.out.println(str);
        }
           
           System.out.print("Enter your choice : ");
           choice=keyboard.nextInt();
           keyboard.nextLine();
           while (choice<1 || choice>3){
                System.out.print("Worng number! Try again.\nPlease, enter (1-3):  ");
                choice=keyboard.nextInt();
            }
           System.out.println("");
           
         //switch for the customer choice  
       switch(choice){
           
           case 1: //if the customers choose to change thier inforamtions
               
               Customer member= new Customer(name,id,age,phoneNumber);
               
               System.out.print("Enter your name: ");
               name=keyboard.nextLine();
               member.reName(name);
               customer.remove(numC);
               customer.add(numC,String.format("%d- "+name, numC));
               
               System.out.print("Enter your ID number(10 numbers): ");
               id = keyboard.nextLine();
               while(id.length() != 10){
                    System.out.print("Worng! Try again.\nPlease, enter your ID number(10 numbers): ");
                    id = keyboard.nextLine();
                }
                  member.modifyID(id);
           
                System.out.print("Enter your age(allowed between age 7-70 years): ");
                age = keyboard.nextInt();
                while(age<7 || age>70){
                    System.out.print("Worng! Try again.\nPlease, enter your age(allowed between age 7-70 years): ");
                    age = keyboard.nextInt();
                }
                member.modifyAge(age);
                
                keyboard.nextLine();
                System.out.print("Enter your phone number(10 numbers): ");
                phoneNumber = keyboard.nextLine();
        
                while(phoneNumber.length() != 10){
                    System.out.print("Worng! Try again.\nPlease, enter your phone number(10 numbers): ");
                    phoneNumber = keyboard.nextLine();
                }
                member.newPhoneNumber(phoneNumber);
                
               break;
                
       
           case 2: //if the customer choose monthly membership
              
               System.out.print("How many months you want(3 or 6 months)?  ");
               months=keyboard.nextInt();
               keyboard.nextLine();
               while(months!=3&&months!=6){
                    System.out.print("Wrong number! Try again.\nHow many months you want(3 or 6 months)? ");
                    months=keyboard.nextInt();
               }
                if(months==3){
                    monthly3.setPrice(50);
                    Customer member1 = new Customer(name,id,age,phoneNumber,gym,monthly3);
                   System.out.println("\nYou subscribe in monthly membership.\nThe total price :"+monthly3.getMonthlyPrice());
                    outputfile.println(member1);
                    outputfile.println(monthly3);
                    outputfile.println("\n-------------------------------------------");
                }
                
                else if(months==6){
                    monthly6.setPrice(50);
                    Customer member1=new Customer(name,id,age,phoneNumber,gym,monthly6);
                    System.out.println("\nYou subscribe in monthly membership.\nThe total price :"+monthly6.getMonthlyPrice());
                    outputfile.println(member1);
                    outputfile.println(monthly6);
                    outputfile.println("\n-------------------------------------------");
                   
                }
                break;
                
                
                
           case 3: //if the customer choose yearly  membership
               
               yearlyM.setPrice(100);
               yearlyM.chooseOffers();
               Customer member1=new Customer(name,id,age,phoneNumber,gym,yearlyM);
               System.out.println("\nYou subscribe in yearly membership.\nThe total price : "+yearlyM.getyearlyPrice());
               System.out.println("The offer you got is "+yearlyM.myOffers());
               outputfile.println(member1);
               outputfile.println(yearlyM);
               outputfile.println("\n-------------------------------------------");
               break;
              
             }   
       
               
       }while(choice!=2&&choice!=3);//to agian print the menu if the choice is 1
         
           
           System.out.println("\nSubscription information saved successfully");
           System.out.println("--------------------------------------------------\n");
           System.out.println("What do you want to do now?"+
                   "\n1- Add a new customer.\n2- Exit.");
           
           System.out.print("Enter your choice: ");
           selection = keyboard.nextInt();
           keyboard.nextLine();
           
           while (selection!=1&&selection!=2){
                System.out.print("Worng number! Try again\nPlease, enter 1 or 2:  ");
                selection=keyboard.nextInt();
            }
           System.out.println("");
           
            numC++;
          
       }while(selection != 2);
       
       outputfile.printf("The total number of member = %d\n",(numC - 1));
        for(int i = 0;i<customer.size();i++){
            outputfile.println(customer.get(i));
        }
        
        
        System.out.println("\nGoodbye!");
        
       outputfile.close();
       inputfile.close();
      }
       
    
}