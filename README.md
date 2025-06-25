# Gym Membership Management System
This Java console-based application simulates a **Gym Membership Management System**, allowing customers to subscribe to various membership types (monthly or yearly), update their information, and receive offers. The system stores user data in files and supports simple input validation.

## Features
 - Register new gym members  
- Choose between **monthly** and **yearly** memberships  
    - **Monthly plan** supports 3 or 6 months (Swimming)  
    - **Yearly plan** includes multiple classes and bonus offers  
- Modify personal information (name, ID, phone, age)  
- Input validation for age, phone number, and ID  
- Dynamic member ID generation   
- Save all user data and subscriptions to `Gym.txt`


## Project Structure
` GymDemo.java`:  Main program logic and user interface

`Customer.java `: Customer data and editing functions

`GymMembership.java `: Abstract class for memberships

`MonthlyMembership.java`:  Monthly membership implementation

`YearlyMembership.java`: Yearly membership implementation

`Gym.txt ` Output file storing subscription records


# Sample Console Output:
![Image](https://github.com/user-attachments/assets/db89d721-60bc-4d2f-85b2-f973fcf650c1)
