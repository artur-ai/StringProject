import java.util.Arrays;

public class StringMethods {
    public static String textCorector(String text){
        text = text.replaceAll("(?i)java", "python");
        String[] sentence = text.split("\\. ");
        for(int i = 0; i < sentence.length; i++){
            StringBuilder stringBuilder = new StringBuilder(sentence[i]);
            stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
            sentence[i] = stringBuilder.toString();
        }
        return String.join(". ", sentence);
    }

    public static String PalindromeMethods(String sentences){
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentences.split(" ");
        for(int i = 0; i < words.length; i++){
            String cleanWords = words[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
            if(isPalindrome(cleanWords)&& cleanWords.length() > 1){
                stringBuilder.append(words[i]).append(" is palindrome \n");
            }
        }
        return stringBuilder.toString();
    }

    public static boolean isPalindrome(String string){
        
        return string.equals(new StringBuilder(string).reverse().toString());
    }


    public static String reverseWords(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            String cleanWord = words[i].replaceAll("[^a-zA-Z]", "");
            String reversedWord = new StringBuilder(cleanWord).reverse().toString();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }

    public static boolean areAnagrams(String stringFirst, String stringSecond) {
        if (stringFirst.length() != stringSecond.length()) {
            return false;
        }

        char[] arrayFirst = stringFirst.toCharArray();
        char[] arraySecond = stringSecond.toCharArray();

        Arrays.sort(arrayFirst);
        Arrays.sort(arraySecond);

        return Arrays.equals(arrayFirst, arraySecond);
    }
}
