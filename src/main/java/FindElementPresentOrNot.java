import java.util.Scanner;

public class FindElementPresentOrNot {
    public static void main(String[] args) {
         int[] array= {1,2,3,4,5,6};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number need to find:");
        int numberNeed = sc.nextInt();

       boolean found =false;

        for (int element : array) {
            if (numberNeed == element) {
                found=true;
                break;
            }}

                if(found){
                System.out.println("element is present");
            } else {
                System.out.println("element is not present ");
            }}

        }

