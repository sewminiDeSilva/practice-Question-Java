public class ReverseTheSentence {
    public static void main(String[] args) {

        String sentence = "work hard friend";
        System.out.println("given sentence:" +sentence);
        String rev ="";
        String[] split = sentence.split(" ");
        int count = split.length;
        for (int i = count-1; i >=0 ; i--) {
            rev =rev + split[i]+" ";

        }
        System.out.println("reverse sentence:"+ rev);
    }
}
