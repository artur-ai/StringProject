import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Main extends StringMethods {
    public static void main(String[] args) {
        //1
        String text = "java is a programming language, java is very popular. java is used in web development, java also works for mobile apps. Java is versatile, java can run on different platforms. Java is powerful, java is widely used in the industry. many developers prefer Java, especially for large systems.";
        String result =  textCorector(text);
        System.out.println("Завдання 1:");
        System.out.println(result + "\n");


        //2
        String sentences = "Madam, I am Adam and racecar is cool.";
        String result1 = PalindromeMethods(sentences);
        System.out.println("Завдання 2: Полідром:");
        System.out.println(result1);



        //3
        String sentence1 = "Madam, I am Adam and racecar is cool.";
        String reversedSentence = reverseWords(sentence1);
        System.out.println("Завдання 3: Реверс кожного слова: ");
        System.out.println(sentence1);
        System.out.println(reversedSentence);


        //4
        String a = "copmputer";
        String b = "temppurco";
        boolean isAnagram = areAnagrams(a, b);
        System.out.println("\nЗавдання 4: Перевірка на анаграми: ");
        if (isAnagram) {
            System.out.println(a + " і " + b + " є анаграмами.");
        } else {
            System.out.println(a + " і " + b + " не є анаграмами.");
        }



    }
}
