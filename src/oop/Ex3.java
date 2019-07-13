package oop;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Excercise[] excercises = {
                new Excercise("Burpees", 5, 1),
                new Excercise("Pushups", 10, 5),
                new Excercise("Pullups", 10, 7),
                new Excercise("Meditate", -5, 0),
        };

        Supplement[] supplements = {
                new Supplement("Isotoric Water", 25),
                new Supplement("Electrolytes", 5),
                new Supplement("Water", 15)
        };

        int exCount = excercises.length;
        int suppCount = supplements.length;

        Trainee trainee = new Trainee("John Jones", 100, 5);

        while(trainee.getStamina() > 0){
            System.out.println("Excercices:");
            for(int i = 0; i<exCount; i++){
                System.out.printf("%d) %s\n", (i + 1), excercises[i]);
            }

            System.out.println("Supplements:");
            for(int i = 0; i<suppCount; i++){
                System.out.printf("%d) %s\n", (i + exCount + 1), supplements[i]);
            }

            System.out.print("Select action:");

            int action = sc.nextInt();

            if(action <= exCount){
                trainee.doExcercise(excercises[action - 1]);
            }
            else {
                trainee.consumeSupplement(supplements[action - exCount - 1]);
            }
        }

        System.out.println("Game over");
    }
}
