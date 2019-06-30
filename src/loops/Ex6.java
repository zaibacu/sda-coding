package loops;

import java.util.Scanner;

public class Ex6 {
    public static void checkPrice(float price){
        checkPrice(price, true);
    }

    public static void checkPrice(float price, boolean first){
        Scanner sc = new Scanner(System.in);
        if(first)
            System.out.printf("That'll be: %.2f EUR\n", price);
        float money = sc.nextFloat();
        if((price - money) <= 0.00001){
            System.out.println("Here you are");
            float change = money - price;
            if(change >= 0.00001){
                System.out.printf("Your change: %.2f EUR\n", change);
            }

        }
        else{
            float difference = price - money;
            System.out.printf("Not enough money. We still need: %.2f EUR\n", difference);
            checkPrice(difference, false);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Milk - 1.99 EUR");
        System.out.println("2) Wine - 6.15 EUR");
        System.out.println("3) Bag of Chips - 0.50 EUR");

        int item = sc.nextInt();

        if(item == 1){
            checkPrice(1.99f);
        }
        else if(item == 2){

            System.out.println("Please enter your age:");
            int age = sc.nextInt();
            if(age >= 20){
                checkPrice(6.15f);
            }
            else{
                System.out.println("Sorry, you're underage");
            }

        }
        else if(item == 3){
            checkPrice(0.5f);
        }
        else {
            System.out.println("We don't have such item");
        }
    }
}
