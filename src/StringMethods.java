import java.util.Arrays;

public class StringMethods {
    public static String textCorector(String text){
        text = text.replaceAll("(?i)java", "python");
        String[] sentence = text.split("\\. ");
        for(int i = 0; i < sentence.length; i++){
            StringBuilder sb = new StringBuilder(sentence[i]);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            sentence[i] = sb.toString();
        }
        return String.join(". ", sentence);
    }

    public static String Palindrome(String sentences){
        StringBuilder sb = new StringBuilder();
        String[] words = sentences.split(" ");
        for(int i = 0; i < words.length; i++){
            String cleanWords = words[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
            if(isPalindrome(cleanWords)&& cleanWords.length() > 1){
                sb.append(words[i]).append(" is palindrome \n");
            }
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
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

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
