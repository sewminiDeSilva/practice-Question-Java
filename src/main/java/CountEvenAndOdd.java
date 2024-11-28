public class CountEvenAndOdd {
    public static void main(String[] args) {
        int number= 777776;
        int oddCount = 0,evenCount =0;

        while (number>0){
            int num = number%10;
            if (num%2 == 0) {
               evenCount++ ;
            }else {
                oddCount++;
            }
            number=number/10;
        }
        System.out.println("Even count:"+evenCount+" Odd count:"+oddCount);
    }

}
