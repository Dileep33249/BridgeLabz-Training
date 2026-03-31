import java.util.*;
public class WhileVsForumulaInSumOfNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int sumUsingWhile=0;
        int count=number;
        while(count > 0){
            sumUsingWhile += count;
            count--;
        }
        int SumWithFormula= number * (number + 1) / 2;

        if(sumUsingWhile == SumWithFormula){
            System.out.println("Both methods give the same result: " + sumUsingWhile);
        }
        else{
            System.out.println("Results are different While sum is: " + sumUsingWhile + " and Formula sum: " + SumWithFormula);
        }
    }

}
