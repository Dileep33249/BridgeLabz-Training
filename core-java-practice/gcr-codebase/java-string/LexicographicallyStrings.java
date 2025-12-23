package com.built;
import java.util.*;
public class LexicographicallyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
		String s2=sc.next();
       
		int ans=helper(s1,s2);
		
		if(ans==0) {
			System.out.println("both strings are equal");
		}
		else if(ans < 0) {
			System.out.print("First string is lexigraphically is shorter");
		}
		else {
			System.out.print("First string is lexigrapcially greater:");
		}
			
		
		
	}private static int helper(String s1,String s2) {
		
		int i=0;
		
		while(i < s1.length() && i < s2.length()) {
			
			if(s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
			i++;
		}
		return s1.length() - s2.length();
	}

}
