import java.util.*;
public class OddOrEvenWithLastAndFirstMatching {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int [] numArray=new int[5];
        for(int i=0;i<numArray.length;i++){
            numArray[i]=sc.nextInt();
        }

        for(int i=0;i<numArray.length;i++){
            if(numArray[i] < 0){
                System.out.println("Negative");
            }
            else if(numArray[i]==0){
                System.out.println("Zero");
        }
        else if(numArray[i] % 2 == 0){
                System.out.println("Even Number: " + numArray[i]);
            }
            else{
                System.out.println("Odd Number: " + numArray[i]);
            }
        }

        if(numArray[0] == numArray[numArray.length - 1]){
            System.out.println("First and Last elements are matching: " + numArray[0]);
        }
        else if(numArray[0] < numArray[numArray.length - 1]){
            System.out.println("First element is smaller than last element");
        }else{
            System.out.println("First element is greater than last element");
        }
    }
}
