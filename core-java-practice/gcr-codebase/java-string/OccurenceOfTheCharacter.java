package com.built;
import java.util.*;
public class OccurenceOfTheCharacter {
  public static void main(String [] args) {
	  
	  Scanner sc=new Scanner(System.in);
	  
	  String str=sc.next();
	  char ans=countMax(str);
	  
	  System.out.print(ans);
	  
  }private static  char countMax(String str) {
	  String temp=str.toLowerCase();
	  int [] max=new int[26];
	  
	  for(int i=0 ;i < str.length(); i++) {
		  max[temp.charAt(i)-'a']++;
	  }
	  
	  int ans=0;
	  int idx=0;
	  for(int i=0;i<max.length ;i++) {
		 if(max[i] > ans) {
			 ans=max[i];
			 idx=i;
		 }
	  }
	  
	  return (char)(idx + 97);
  }
}
