public class FindNumberAndSum {
    public static void main(String[] args) {
        String input = "Helooo 123";
         int sum = 0;
        for (int i = 0; i < input.length(); i++) {

            char character = input.charAt(i);
            if (Character.isDigit(character))  {
sum=sum +Character.getNumericValue(character);
            }

        }
        System.out.println("sum of digits in given String:" +sum);
    }
}
