package basics;

public class Ex3 {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "helloo";
        String s3 = "helloooooooooo";

        System.out.printf("%s %s %s\n", s1, s2, s3);
        System.out.printf("%-15s|%-15s|%-15s|\n", s1, s2, s3);
        System.out.printf("%15s|%15s|%15s|\n", s1, s2, s3);
    }
}
