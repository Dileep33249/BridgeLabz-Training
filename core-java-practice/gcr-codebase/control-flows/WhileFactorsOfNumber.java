import java.util.*;
public class WhileFactorsOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

          System.out.println("Factors of " + number + " are: ");
          int count=1;
          while(count <= number){
            if(number % count == 0){
                System.out.println(count);
            }
            count++;
          }
        }
    }


