import java.util.*;
public class SumUntilNegativeOrZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int TotalSum=0;
        int [] NumArray=new int[10];
        int idx=0;

        while(true){
            if(idx==10){
                break;
            }
            System.out.println("Enter number:");
            int number=sc.nextInt();
            if(number <=0){
                break;
            }
            NumArray[idx]=number;
            TotalSum+=number;
            idx++;
        }
        
        System.out.println("Total Sum is "+TotalSum);
    }
}
