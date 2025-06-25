/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

public class GymMembership {

    private static int memberID = 0;
    public final double price;

    public GymMembership() {
        price = 100;
    }

    public GymMembership(GymMembership object2){
        memberID = object2.memberID;
        price = object2.price;
    }

    public GymMembership(int mID,double p){
        memberID = mID;
        price = p;
    }

    public int getMemberID() {
        return memberID ;
    }

    public double getPrice() { 
        return price;
    }
    public void memberID(){
        memberID ++;
    }
    public void setPrice(double p){
        p = price;
    }

    public String toString(){
        String str;
        str = "\n member ID: "+memberID + "\n The price of 1 month: "+price;
        return str ;

    }


}


