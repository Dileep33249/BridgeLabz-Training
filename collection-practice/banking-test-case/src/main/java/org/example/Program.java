package org.example;

public class Program {
   double balance;
   Program( double intialAmount ){
       this.balance=intialAmount;
   }
     public double getBalance(){
       return balance;
     }
   public void deposit(double amount) throws Exception{
       if(amount < 0){
           throw new Exception("Deposit amount cannot be negative");
       }

       balance+=amount;
       System.out.println("amount added successfully");
   }

   public void withdraw(double amount) throws Exception{

       if(amount > balance){
           throw new Exception("Insufficient funds");
       }

          balance-=amount;
       System.out.println("money deducted successfully");

   }

}
