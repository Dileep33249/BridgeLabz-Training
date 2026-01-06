package com.review;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String [] args){
        
        String str="programmingg";
        System.out.println(removeDuplicates(str));
        
        
    }
    
    private static String removeDuplicates(String str){
        char [] arr=str.toCharArray();
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
               arr[i]=' ';
            }
        }
        
      String ans="";
      for(int i=0;i < arr.length;i++){
          if(arr[i]==' ')
          continue;
          else
          ans+=arr[i];
      }
      
      return ans;
    }
}