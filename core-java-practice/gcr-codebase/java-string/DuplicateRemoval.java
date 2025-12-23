package com.built;
import java.util.*;
public class DuplicateRemoval {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String originalString=sc.next();
		
		String ans=answer(originalString);
		
		System.out.print("original string was "+ originalString+" answer after remove duplicacy "+ans);
		
	}
	private static String answer(String str) {
		String ans="";
		
		for(int i=0; i < str.length(); i++) {
			
			if(ans.indexOf(str.charAt(i)) ==-1 ) {
				ans+=str.charAt(i);
			}else {
				continue;
			}
		}
		return ans;
	}

}
