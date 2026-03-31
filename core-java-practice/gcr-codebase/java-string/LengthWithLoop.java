package com.gcr.stringsol;

import java.util.Scanner;

public class LengthWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		System.out.println(helperLength(str));
		System.out.println(str.length());
		
	}
		public static int helperLength(String str) {
			
		int i=0;
		int count=0;
		
		try {
		while(true) {
			str.charAt(i);
			i++;
			count++;
		}
		} catch(StringIndexOutOfBoundsException e) {
			return count;
		}
	}

}
