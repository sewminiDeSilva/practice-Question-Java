import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {
        //star
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int numberLines = sc.nextInt();

        int row,column;
        for (row = 0; row < numberLines; row++) {
            for(column=0; column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();
        }

    //number pattern
    int row1,column1;
        int start=1;
        for (row1 = 0; row1 < numberLines; row1++) {
            for ( column1 = 0; column1 <=row1 ; column1++) {
                System.out.print(start+" ");
                start++;
            }System.out.println();
        }

    }

}
