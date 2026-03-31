package com.built;
import java.util.*;
public class VowelsAndConsosents {
   public static void main(String [] args) {
	   
	   Scanner sc=new Scanner(System.in);
	   
	   String str=sc.next();
	   
	   counter(str);
	   
	   
   }private static void counter(String str) {
	   char [] charArray=str.toCharArray();
	   
	   int vowels=0;
	   int consonets=0;
	   
	   String temp="aeiou";
	   
	   for(int i=0;i<str.length();i++) {
		   char c=charArray[i];
		   if(temp.indexOf(c) < 0) {
			   consonets++;
		   }
		   else {
			   vowels++;
		   }
	   }
	   
	   System.out.println("Number of vowels is "+vowels+" ,number of consonets is "+consonets);
   }
}
