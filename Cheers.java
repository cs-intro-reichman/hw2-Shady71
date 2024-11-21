import java.util.Locale;

// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase();
        int num = Integer.parseInt(args[1]);
        int indexCounter = 0;
        String specialLetters = "AEFHILMNORSX";

        for (int i = 0; i < word.length(); i++) {
            char wordChr = word.charAt(indexCounter);
            String chooseWord = specialLetters.indexOf(wordChr) != -1 ? "an: " : "a: ";
            System.out.println("Give me " + chooseWord + wordChr + "!");
            indexCounter++;
        }
        System.out.println("What does that spell? ");

        for (int l = 0; l < num; l++) {
            System.out.println(word + "!!!");
        }
    }
}
