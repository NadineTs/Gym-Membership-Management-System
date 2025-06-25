/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

public class YearlyMembership extends GymMembership{
     
  private String classType;
  private String offer;
  private double yearlyPrice;
  
  
  
     public YearlyMembership(String ct,double yp){
      classType = ct;
      yearlyPrice = yp;
      }
     
     
     
    public YearlyMembership(YearlyMembership object2){
        classType=object2.classType;
        yearlyPrice=object2.yearlyPrice;
    }

   
    
    public void chooseOffers(){
        Scanner s = new Scanner(System.in);
        int choice;
             
        System.out.println("Choose one of thees offers(enetr 1 or 2):\n"+
                "1- 20% discount on subscribtion in diet center \n"
                +"2-Free medical test in jeddah hospital");
        System.out.print("Enter your choice: ");
        choice = s.nextInt();
        while(choice!=1&&choice!=2){
            System.out.print("worng! try again\nplease enter your choice 1 or 2:");
            choice = s.nextInt();
        }
        if(choice==1){
            offer= ("20% discount on subscribtion in diet center ");
        }
        if(choice==2){
            offer=(" Free medical test in java hospital");
        }
    }
     
    public String myOffers(){
        return offer;
    }
    
    public void setClasses(String ct,double yp){
      classType = ct;
      yearlyPrice = yp;
    }
    
    public String getclasses(){
        return classType;
    }

    @Override
    public void setPrice(double p){
        yearlyPrice = p+(price*12);
    }
    
    public double getyearlyPrice(){ 
        return yearlyPrice;
    }
    
    
    
   public String toString(){
       return "The classes are: "+classType+
               "\n The total price is: "+yearlyPrice+
                      "\n The offer is: " +offer;
   }
}



