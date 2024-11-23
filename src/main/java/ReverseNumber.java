import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =sc.nextInt();

        //using algorithm
        int rev =0;
        while (num!=0){
            rev =rev*10 + num%10;
            num=num/10;
        }
        System.out.println("reverse number:"+ rev);
        System.out.println();


        //using StringBuffer
        Scanner sc2 =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num2 =sc2.nextInt();

        StringBuffer rev2;
        StringBuffer sb =new StringBuffer(String.valueOf(num2));
        rev2=sb.reverse();
        System.out.println("reverse number:"+ rev2);

    }
}
