public class SortElementInArray {
    public static void main(String[] args) {
       int[] array ={3,1,5,8,3,7};
       //

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j-1]>array[j]) {
                   int temp =array[j];
                   array[j]=array[j-1];
                   array[j-1]=temp;
                }
            }}
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]);
            }


    }
}
