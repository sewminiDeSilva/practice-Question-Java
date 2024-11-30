import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        //prime
        //>1
        //only should have 2 factor
      int factorCount =0;
        if (number >1) {
            for (int i = 1; i <= number; i++) {
                if (number%i == 0) {
                    factorCount++;
                }
            }
            if (factorCount==2) {
                System.out.println(number + " is a PrimeNumber");}
            else {
                System.out.println(number + " is  not a PrimeNumber");
            }

        }else {
            System.out.println(number + " is  not a PrimeNumber");
        }
    }
}
