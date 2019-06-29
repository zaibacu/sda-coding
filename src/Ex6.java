import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float:");
        float a = sc.nextFloat();
        System.out.println("Enter byte:");
        byte b = sc.nextByte();
        System.out.println("Enter char:");
        char c = sc.next().charAt(0);

        System.out.printf("a: %s b: %s c: %s", a, b, c);
    }
}
