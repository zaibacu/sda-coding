package loops;

import java.util.Random;

public class Ex10 {
    public static String randomText(){
        Random rnd = new Random();
        String[] letters = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "P", "O", "Q", "R", "S", "T", "U", "X", "Y", "W", "Z", " "
        };

        int n = rnd.nextInt(90) + 10;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            String letter = letters[rnd.nextInt(letters.length)];
            sb.append(letter);
        }

        return sb.toString();
    }

    public static String longestWord(String[] words){
        String M = "";
        for(String word : words){
            if(M.length() < word.length()){
                M = word;
            }
        }
        return M;
    }

    public static void main(String[] args){
        String text = randomText();
        System.out.println(text);
        String[] words = text.split(" ");
        System.out.println("Longest word: " + longestWord(words));
    }
}
