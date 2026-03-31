import java.util.*;
public class TableSixToNineOnly {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if(number >= 6 && number <= 9){
            for(int i=1; i <= 10; i++){
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } else {
            System.out.println("Please enter a number between 6 and 9.");
        }   
    }
}
