import java.util.Arrays;

public class FindSmallestNum {
    public static void main(String[] args) {

        int[] givenArray = {2,4,5,1,3,6};

        int smallest = Integer.MAX_VALUE;

        for (int j : givenArray) {
            if (j < smallest) {
                smallest = j;
            }

        }
        System.out.println("smallest number:"+ smallest);
        System.out.println();

  //Integer.MAX_VALUE: This is the largest possible value an int can hold in Java, which is 2,147,483,647.
// setting the smallest variable to this large value, Integer.MAX_VALUE, at the start.
//By starting with the largest number, you can be sure that the first number you compare will be smaller.

        //using Arrays.sort()
        Arrays.sort(givenArray);
        System.out.println("smallest number:"+ givenArray[0]);


    }
}
