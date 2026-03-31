import java.util.*;
public class FactorialOfNumWithWhile {
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();
       int factorial = 1;
       int i = 1;
       while(i <= number) {
        factorial *= i;
           i++;
         }
         System.out.println("Factorial of " + number + " is " + factorial);
    }
}
