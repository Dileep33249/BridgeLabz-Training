import java.util.Scanner;

public class MeanHeight {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        double [] heightArray=new double[11];

        double sum=0;
        for(int i=0;i<heightArray.length;i++){
            heightArray[i]=sc.nextDouble();
        }
        for(int i=0;i<heightArray.length;i++){
            sum+=heightArray[i];
        }
        double mean = sum/heightArray.length;
        System.out.println("Mean Height is: " + mean);
    }
}
