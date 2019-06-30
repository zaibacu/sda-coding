package loops;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a < 30 || b < 30){
            System.out.println("a or b < 30");
        }
        if(a > 30 || b > 30){
            System.out.println("a or b > 30");
        }
        if(a == 30 || b == 30){
            System.out.println("a or b = 30");
        }
    }
}
