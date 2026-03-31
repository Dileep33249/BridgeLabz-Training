import java.util.*;
public class MultiplicationArray {
    public static void main(String[] args){
        int [] multiArray=new int[10];

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();    

        for(int i=0;i<multiArray.length;i++){
            multiArray[i]=number * (i+1);
        }

        for(int i=0;i<multiArray.length;i++){
            System.out.println(number + " * " + (i+1) + " = " + multiArray[i]);
        }
    }
}
