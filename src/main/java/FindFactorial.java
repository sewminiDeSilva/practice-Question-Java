import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();

//factorial ex; 3!  =3*2*1=6

        int factorial=1;
        for (int i = 1; i <=number ; i++) {
            factorial=factorial*i;

        }
        System.out.println("factorial of number "+ number+":"+factorial);
    }

}
