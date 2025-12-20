import java.util.Scanner;
public class SumOfElementsUntillZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double Totalsum=0.0;
        double number=0.0;
        while(true){
            if(number == 0){
                break;
            }
            Totalsum+=number;
            number=sc.nextDouble();
        }
        System.out.println("Total sum of the all user eneter numbers"+ Totalsum);
    }
}
