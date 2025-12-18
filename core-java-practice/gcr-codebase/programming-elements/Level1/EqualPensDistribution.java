package Level1;
import java.util.*;
public class EqualPensDistribution{
    public static void main(String[] args){

        int totalPens=14;
        int totalStudents=3;

        int pensPerStudent=totalPens / totalStudents;
        int remainingPens=totalPens % totalStudents;
        System.out.println("The pen per student is " + pensPerStudent + " pens"+ " and the remaining pens not distributes is: " + remainingPens);
    }
}