/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_task_04;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_Task_04 {

    public static void main(String[] args) {
        //Activity No.01
       /* Counter c = new Counter();
        c.increment();
        c.increment();
        c.decrement();
        System.out.println("Final count: "+ c.getCount()); */   
       
       //Student Exercises.
       //Task 35
       /* Book myBook1 = new Book("Data Structure", "Prof.Usman", 15.99);
        Book myBook2 =new Book("English","Dr.Anees",16.98);
        myBook1.displayDetails();
        myBook2.displayDetails();
        myBook1.updatePrice(12.49);
        myBook2.updatePrice(15.49);
        System.out.println("After Price Update:");
        myBook1.displayDetails();
        System.out.println("After Price Update:");
        myBook2.displayDetails();*/
       
       //Task 36 
       /* Rectangle r = new Rectangle(10, 5);
        System.out.println("Width: "+ r.width);
        System.out.println("Height: "+ r.height);
        System.out.println("Area: " +r.area());
        System.out.println("Perimeter: "+ r.perimeter());*/
       
       //Challenge Task
       BankAccount account = new BankAccount("Hammad", 5000);
        account.deposit(2000);
        account.withdraw(3000);
        System.out.println("Account Holder: Hammad");
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(10000);
        System.out.println("Final Balance: " + account.getBalance());
    }
}
