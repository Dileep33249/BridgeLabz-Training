package com.built;
import java.util.*;
public class WordReplace {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		String word=sc.next();
		String neword=sc.next();
		
		System.out.println(helper(str,word,neword));
		

	}private static String helper(String str ,String wordUser,String newWord) {
		
		String [] word=str.split(" ");
		
		boolean flag=false;
		
		for(int i=0;i<word.length;i++) {
			if(word[i].equals(wordUser)) {
				word[i]=newWord;
				flag=true;
			}
		}
		if(!flag) {
			return "Word not found in given string";
		}
		String ans="";
		for(int i=0;i<word.length;i++) {
			ans+=word[i]+" ";
		}
		
		return ans.substring(0,ans.length()-1);
	}

}
