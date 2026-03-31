package set2;

import java.util.*;
class KeyGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        KeyGeneration obj =new KeyGeneration();
        
        for(int i=0 ;i < n ; i++){
            String str = sc.next();
            System.out.println(obj.KeyGenerationFunction(str));
        }
    
    
    }
        public String KeyGenerationFunction(String str){
            if(str == null || str.length() ==0 ){
                return "Empty string";
            }
            else if(str.length() < 6){
                return "Input string invalid";
            }
            else if(str.contains(" ")){
                return "String contains space";
            }
            else if(str.matches(".*\\d.*")){
                return "String contains digits";
            }
            else if(!str.matches("^[a-zA-z]")){
                return "String contains spacial characters";
            }
            else{
            
        
        String secondString = str.toLowerCase();
        String ans = "";
        for(int i=0;i<secondString.length();i++){
            int n = secondString.charAt(i);
            if(n % 2 ==0){
                continue;
            }
            else{
                ans+=secondString.charAt(i);
            }
        }
        StringBuilder ans1 = new StringBuilder(ans);
        ans1 = ans1.reverse();
        String answer ="";
        String finalstr = ans1.toString();
        for(int i = 0;i<finalstr.length() ; i++){
            if(i % 2==0){
                char c = (char)(finalstr.charAt(i) - 32);
                answer+=c;
            }
            else{
                answer+=finalstr.charAt(i);
            }
        }
         return answer;
        
            }
    }
}
