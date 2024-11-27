public class CountSumOfDigits {
    public static void main(String[] args) {
        int input =12345;
        int sum =0;

        while (input>0){
            int num = input%10;
            sum= sum+num;
            input=input/10;
        }
        System.out.println("sum of digits in given number is " + sum);
    }
}
