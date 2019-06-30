package loops;

import java.util.Random;

public class Ex9 {
    public static int[] randomArray(){
        Random rnd = new Random();
        int n = rnd.nextInt(7) + 3;
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = rnd.nextInt(100);
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int number : array){
            System.out.println(number);
        }
    }

    public static int maxNumber(int[] array){
        int M = 0;
        for(int number : array){
            if(M < number){
                M = number;
            }
        }
        return M;
    }

    public static void main(String[] args){
        for(int i=0; i<5; i++){
            int[] array = randomArray();
            printArray(array);
            System.out.printf(
                    "Max number is: %d\n",
                    maxNumber(array)
            );
        }

    }
}
