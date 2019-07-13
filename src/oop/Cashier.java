package oop;

import java.util.Scanner;

public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void requirePayment(double sum){
        Scanner sc = new Scanner(System.in);

        double diff = sum;
        do {
            System.out.printf("That'll be %.2f EUR\n", diff);
            System.out.print(">");
            float payment = sc.nextFloat();
            diff -= payment;
        }while(!MoneyUtils.isEqual(diff, 0) && diff > 0);


        if(MoneyUtils.isEqual(diff, 0)){
            System.out.println("Thank you.");
        }

        else if(diff < 0){
            System.out.printf("Your change: %.2f EUR\n", Math.abs(diff));
        }
    }
}
