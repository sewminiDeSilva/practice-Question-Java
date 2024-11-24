public class ReplaceCharacter {
    public static void main(String[] args) {

        String givenText = "what a wonderful world";
        givenText =givenText.toLowerCase();
        //replace vowel with special character(*)
        char[] charArray = givenText.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a'|| charArray[i]=='e'|| charArray[i]=='i'|| charArray[i]=='o'
                    || charArray[i]=='u') {
                charArray[i] = '*';
            }
        }
                System.out.println(charArray);

        //using replaceAll
        String replaceText =givenText.replaceAll("[aeiou]", "*");
        System.out.println(replaceText);

        //

    }
}
