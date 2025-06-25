
 package project;


public class MonthlyMembership extends GymMembership {
    
    private String classType;
    private int months;
    private double monthlyPrice;
    
    

    public MonthlyMembership(String ct, int m,double mp) {
        classType = ct;
        months = m;
        monthlyPrice=mp;
    }
    
   
    public MonthlyMembership(MonthlyMembership object2) {
     classType=object2.classType;
     months=object2.months;
     monthlyPrice=object2.monthlyPrice;
    }

    
    public void setClasses(String ct, int m){
        classType = ct;
        months = m;
        
    }



    public String getClasses(){
        return classType;
    }



    @Override
    public void setPrice(double p){
        monthlyPrice=p+(months*price);
        }
    
    
   
    public double getMonthlyPrice(){
       return monthlyPrice;
    }
    
    
    
    
    public String toString(){
       return " The class is: "+classType+
               "\n the number of months is:" +months+
               "\n The total price is: "+monthlyPrice;
                      
   }

}
    

