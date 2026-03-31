import java.util.*;
public class SumOfNNaturalNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        if(number <=0 ){
            System.out.println("The number is not natural");
        }
        else{
            int totalSum=number*(number+1)/2;
            System.out.println("The sum of "+ number + "is "+totalSum);
        }
    }
}
