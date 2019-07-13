package oop;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Exercise[] exercises = {
                new Exercise("Burpees", 5, 1),
                new Exercise("Pushups", 10, 5),
                new Exercise("Pullups", 10, 7),
                new Exercise("Meditate", -5, 0),
        };

        Supplement[] supplements = {
                new Supplement("Isotoric Water", 25),
                new Supplement("Electrolytes", 5),
                new Supplement("Water", 15)
        };

        int exCount = exercises.length;
        int suppCount = supplements.length;

        Trainee trainee = new Trainee("John Jones", 100, 5);

        while(trainee.getStamina() > 0){
            System.out.println("Excercices:");
            for(int i = 0; i<exCount; i++){
                System.out.printf("%d) %s\n", (i + 1), exercises[i]);
            }

            System.out.println("Supplements:");
            for(int i = 0; i<suppCount; i++){
                System.out.printf("%d) %s\n", (i + exCount + 1), supplements[i]);
            }

            System.out.print("Select action:");

            int action = sc.nextInt();

            if(action <= exCount){
                trainee.doExcercise(exercises[action - 1]);
            }
            else {
                trainee.consumeSupplement(supplements[action - exCount - 1]);
            }
        }

        System.out.println("Game over");
    }
}
