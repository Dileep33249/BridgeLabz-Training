import java.util.Scanner;
public class SumOfTheNumbersUntillLessZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double Totalsum=0.0;
        while(true){
            double number=sc.nextDouble();
            if(number < 0){
                break;
            }
            Totalsum+=number;
            number=sc.nextDouble();
        }
        System.out.println("Total sum of the all user entered numbers is "+ Totalsum);
    }
}