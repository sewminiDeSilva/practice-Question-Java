public class SumOfArrayElements {
    public static void main(String[] args) {

        int[] a= {1,2,3,4,5};
        int sum=0;

        for (int j : a) {
            sum = sum + j;

        }
        System.out.println("sum:"+sum);
    }
}
