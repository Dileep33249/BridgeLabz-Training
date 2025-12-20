import java.util.Scanner;

public class NumberIsZeroOrPositiveOrNegative {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=sc.nextInt();
        if(number==0){
            System.out.println("The number is zero");
        }
        else if(number>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
