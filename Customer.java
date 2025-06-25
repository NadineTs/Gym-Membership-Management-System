/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hp
 */
public class Customer {
    
    private String nameOfCustomer;// name of the customer.
    private String ID;// ID number of the customer.
    private int age;// customer age.
    private String phoneNumber;// customer's phone number
    private GymMembership gymMembership;// the gym membership.
    private MonthlyMembership monthlyMem;// the monthly membership.
    private YearlyMembership yearlyMem;// the yearly membership.
    
    /**
     * This constructor initializes some fields.
     * @param name the name of the customer.
     * @param id ID number.
     * @param a age.
     * @param phoneN phone number
     */
    public Customer(String name, String id, int a ,String phoneN){
        nameOfCustomer = name;
        ID = id;
        age = a;
        phoneNumber = phoneN;
        
    }
    
    /**
     * This constructor initializes fields
     * use it when the users want yearly membership
     * @param name the name of the customer.
     * @param id ID number.
     * @param a age.
     * @param phoneN phone number
     * @param gym a gym membership object
     * @param yearlyM a yearly membership object
     */
    public Customer(String name , String id , int a ,String phoneN ,
                    GymMembership gym , YearlyMembership yearlyM){
        
        nameOfCustomer = name;
        ID = id;
        age = a;
        phoneNumber = phoneN;
        gymMembership = new GymMembership(gym);
        yearlyMem = new YearlyMembership(yearlyM);
        
    }
    
    /**
     * This constructor initializes fields
     * use it when the users want monthly membership
     * @param name the name of the customer.
     * @param id ID number.
     * @param a age.
     * @param phoneN phone number
     * @param gym a gym membership object
     * @param monthlyM a monthly membership object
     */
    public Customer(String name , String id , int a ,String phoneN ,
                    GymMembership gym , MonthlyMembership monthlyM){
        
        nameOfCustomer = name;
        ID = id;
        age = a;
        phoneNumber = phoneN;
        gymMembership = new GymMembership(gym);
        monthlyMem = new MonthlyMembership(monthlyM);
        
    }
    
    public void reName(String n){
        nameOfCustomer = n;
    }
    public void modifyID(String id){
        ID =id;
    }
    public void newPhoneNumber(String pN){
        phoneNumber = pN;
    }
    public void modifyAge(int a){
        age = a;
    }
    public String memberName(){
        return nameOfCustomer;
    }
    public String getID(){
        return ID;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int getAge(){
        return age;
    }
    /**
     * getGym method
     * @return a copy of th gym membership object
     */
    public GymMembership getgym(){
        return new GymMembership(gymMembership);
    }
    /**
     * toString method
     * @return a string containing the customer information
     */
    
    public String toString(){
        String str;
        str = "Customer Information: \nname: " + nameOfCustomer + 
                "\nID: " + ID + "\nAge: " + age +
                "\nPhone number: " + phoneNumber +"\n"
                + gymMembership ;
        return str;
    }
    
    
    
}
