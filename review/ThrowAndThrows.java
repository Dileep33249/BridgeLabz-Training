package com.review;
import java.util.*;
public class ThrowAndThrows {
    public static void main(String [] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter yout age: ");
        int age=sc.nextInt();
        
        try{
            ageValidator(age);
            System.out.println("valid age:");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        //  try{
        //     ageValidator2(age);
        //     System.out.println("valid age:");
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
        
        
    }
    // private static void ageValidator2(int age){
    //     if(age < 18 || age > 125)
    //     throw new Exception("only throw keyword");
    // }
    
    private static void ageValidator(int age) throws Exception{
        if(age < 18 || age >125){
            throw new Exception("invalid age");
        }
    }
}