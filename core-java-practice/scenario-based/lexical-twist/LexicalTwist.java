package com.lexicalTwist;

public class LexicalTwist {
	public static void main(String [] args) {
		
		helper("hello", "olleh");
		
		
	}

	private static void helper(String str1, String str2) {
	    String vowel = "AEIOUaeiou";
	    StringBuilder ansString = new StringBuilder();
	    
	  
	    String reversedString = new StringBuilder(str1).reverse().toString();
	    
	    if (reversedString.equals(str2)) {
	        String temp = reversedString.toLowerCase();
	        
	        for (int i = 0; i < temp.length(); i++) {
	            char currentChar = temp.charAt(i);
	            if (vowel.indexOf(currentChar) != -1) {
	                ansString.append("@");
	            } else {
	                ansString.append(currentChar);
	            }
	        }
	        
	        
	        System.out.print(ansString.toString());
	    }
	    else {
	    	String combinedWord=str1+str2;
	    	String tempString=combinedWord.toUpperCase();
	    	int vowelsCount=0;
	    	
	    	for(int i=0;i<tempString.length();i++) {
	    		if(vowel.indexOf(tempString.charAt(i)) != -1) {
	    			 vowelsCount++;
	    		}
	    	}
	    	
	    	int consonentsCount=combinedWord.length()-vowelsCount;
	    	
	    	String ans="";
	    	if( consonentsCount < vowelsCount) {
	    		for(int i=0;i<tempString.length() && ans .length() < 2 ;i++) {
	    			if(vowel.indexOf(tempString.charAt(i)) != -1 && ans.indexOf(tempString.charAt(i)) ==-1) {
	    				ans+=tempString.charAt(i);
	    			}
	    		}
	    		System.out.print(ans);
	    	}
	    	else if( consonentsCount > vowelsCount ) {
	    		
	    		for(int i=0;i<tempString.length() && ans.length() < 2;i++) {
	    			if(vowel.indexOf(tempString.charAt(i)) == -1 && ans.indexOf(tempString.charAt(i))== -1) {
	    				ans+=tempString.charAt(i);
	    			}
	    		}
	    		System.out.print(ans);
	    	}
	    	else {
	    		System.out.print("Vowels and consonants are equal");
	    	}
	    }
	}	
	
	}

