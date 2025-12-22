package com.gcr.stringsol;
import java.util.*;
public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Scanner sc=new Scanner(System.in);
				String FirstString=sc.next();
						String secString=sc.next();
						
						boolean method=helperCompare(FirstString, secString);
						boolean Direct=FirstString.equals(secString);
						
						System.out.println("helper method result is: " + method);
						System.out.println("Direct equals method is: " + Direct);
						
			}
			private static boolean helperCompare(String str1, String str2) {
				
				int length1=str1.length();
						int length2=str2.length();
						
						if(length1 != length2) {
							return false;
						}
						
						for(int i=0; i < length1; i++) {
							if(str1.charAt(i) != str2.charAt(i)) {
								return false;
							}
						}
						
						return true;
			}
		}