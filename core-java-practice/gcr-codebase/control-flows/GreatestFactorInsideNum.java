import java.util.*;
public class GreatestFactorInsideNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        int counter=number-1;
    
        for(int i=counter; i > 0; i--){
            if(number % i == 0){
                System.out.println(i);
                break;
            }
            
        }
    }
}
