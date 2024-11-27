public class CountDigits {
    public static void main(String[] args) {
        int number = 14235;
        int count=0;

        while (number>0) {
            number=number/10;
            count++;
        }
        System.out.println("number of digits:" +count);
        }
    }

