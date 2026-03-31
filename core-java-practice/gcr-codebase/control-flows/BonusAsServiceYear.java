public class BonusAsServiceYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int serviceYears=sc.nextInt();
         int Salary=sc.nextInt();    

        if(serviceYears > 5){
            int bonus = Salary * 5 / 100;
            System.out.println("Employee is eligible for bonus: " + bonus);
        }
        else{
            System.out.println("Employee is not eligible for bonus");
        }
    }
}
