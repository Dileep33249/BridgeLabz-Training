import java.util.*;
public class DivisibleByFive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

         boolean flag=true;
        int number=sc.nextInt();
        if(number % 5!=0){
            flag=false;
        }

        if(flag){
            System.out.println("is the number "+ number + "divsible by 5"+ "Yes");
        }else{
              System.out.println("is the number "+ number + "divsible by 5"+ "No");
        }
    }
}
