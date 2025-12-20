import java.util.*;
public class MultiplesBeforeHundread {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

          int number=scanner.nextInt();

       int counter=number-1;
       while(counter > 1){
        if(counter % number == 0){
            System.out.println(counter);
        }
        counter--;
       }
    }
}