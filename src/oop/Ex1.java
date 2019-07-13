package oop;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GroceryStore store = new GroceryStore();
        store.addProduct("Milk", 1.5f);
        store.addProduct("Cookies", 2.0f);
        store.addProduct("Coffee", 10f);
        store.addProduct("Chocolate", 1.0f);
        store.addProduct("Water", 0.3f);
        while(true){
            store.listProducts();
            System.out.print("Please select product: ");
            int selection = sc.nextInt();
            if(selection >= 5){
                break;
            }
            store.addToCart(selection);

        }
        store.pay();
    }
}
