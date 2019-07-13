package oop;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        double price = 1.46000;
        double money = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.printf("Current sum: %.2f EUR\n", money);
            System.out.printf("Continue filling additional 5l petrol?\n" +
                    "Continue/Finish (c/f) (1l = %.5f EUR)\n", price);
            if(sc.next().equalsIgnoreCase("c")){
                money += price * 5;
            }
            else {
                break;
            }
        }
        System.out.printf("Total sum: %.2f\n", money);
    }
}
