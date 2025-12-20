public class ForLoopAndFormulaCompare {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int sumUsingFormula=number*(number+1)/2;
        int sumUsingForLoop=0;

        for(int i=1; i<=number; i++){
            sumUsingForLoop += i;
        }

        if(sumUsingFormula == sumUsingForLoop){
            System.out.println("Both sums are equal: " + sumUsingFormula);
        } else {
            System.out.println("Sums are not equal Formula sum: " + sumUsingFormula + ", For loop sum: " + sumUsingForLoop);
        }
    }
}
