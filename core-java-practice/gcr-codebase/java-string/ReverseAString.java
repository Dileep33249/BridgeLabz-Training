package com.built;

import java.util.Scanner;

public class ReverseAString {
 public static void main(String [] args) {
	 
	 Scanner sc=new Scanner(System.in);
	 
	 String userString=sc.next();
	 
	 String ans=reverse(userString);
	 
	 System.out.print("Original String is->"+userString+", reverse string is->"+ans);
 }
 private static String reverse(String str) {
	 
	 String ans="";
	 for(int i=str.length()-1;i >=0;i--) {
		 ans+=str.charAt(i);
	 }
	 
	 return ans;
 }
}
