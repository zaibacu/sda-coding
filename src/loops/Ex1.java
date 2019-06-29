package loops;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int a = sc.nextInt();

        if(a < 30){
            System.out.println("a is less than 30");
        }
        else if(a > 30){
            System.out.println("a is greater than 30");
        }
        else{
            System.out.println("a is equal to 30");
        }
    }
}
