import java.util.Locale;
import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args) {
        //using iteration
        String input ="sewmini";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter character to find:");
        char toFind = sc.next().charAt(0);


        int count =0;
        input =input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)==toFind) {
                  count++;
            }
        }
        if(count==0){
            System.out.println("character not found");
        }else{
            System.out.println(toFind+count +" number of time");
        }
    }
}
