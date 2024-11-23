public class StringLength {
    public static void main(String[] args) {
        String givenString ="helloooo";
        System.out.println("Given String:" + givenString);

        System.out.println("length:"+ givenString.length());
        System.out.println();
        //without length() method

        char[] charArray =givenString.toCharArray();
        int length=0;
        for (Character c : charArray){
            length++;
        }
        System.out.println("length:"+ length);
    }
}
//for-each Loop:
//use when you don’t need the index and just want to go through each element in an array or collection.
// It automatically iterates over each element in the collection or array