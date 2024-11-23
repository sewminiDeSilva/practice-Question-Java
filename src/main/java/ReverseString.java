import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {

        String str = "ABCDE";
        String rev = "";
        System.out.println("method 01-using charAt()");
        System.out.println(str.charAt(0));  // print A

        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);



        System.out.println();
        String rev2 = "";
        System.out.println("method 02-using str.toCharArray");
        //System.out.println(str2.toCharArray());

        char[] a = str.toCharArray();
        int length2 = a.length;
        for (int i = length2 - 1; i >= 0; i--) {
            rev2 = rev2 + a[i];
        }
        System.out.println(rev2);




        System.out.println();
        System.out.println("method 03-using StringBuffer");

//        StringBuffer is a Java class used to create and manipulate strings. Unlike regular String objects,
//        StringBuffer allows you to modify strings without creating new objects every time.

        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());


        System.out.println();
        System.out.println("method 04-using collection");

//        A Collection in Java is a way to store and organize data, like a list of items. It provides tools to work with groups of data, such as adding, removing, or searching for items.
//
//                Types of Collections:
//       List
//        Stores items in a specific order and can have duplicates.
//        Example: A shopping list (["apple", "banana", "apple"]).
//       Set
//        Stores only unique items (no duplicates).
//        Example: A collection of countries (["USA", "India", "USA"] becomes ["USA", "India"]).
//       Map
//        Stores data as key-value pairs (like a dictionary).
//        Example: A phonebook ({1: "John", 2: "Alice"}).
//       Queue
//        Stores items to be processed in a first-in-first-out (FIFO) order.
//        Example: A line at a checkout.
//

                List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        Collections.reverse(list);
        for (char c : list) {
            System.out.print(c);
        }





    }

}


