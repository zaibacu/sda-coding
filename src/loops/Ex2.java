package loops;

import java.util.Scanner;

public class Ex2 {
    public static boolean to30(int opCode, int number){
        switch (opCode){
            case 0: // Equals
                return number == 30;
            case 1: // Less
                return number < 30;
            case 2: // Greater
                return number > 30;
            default:
                return false;

        }
    }

    public static String opName(int opCode){
        switch (opCode){
            case 0: // Equals
                return "== 30";
            case 1: // Less
                return "< 30";
            case 2: // Greater
                return "> 30";
            default:
                return "UNKNOWN";

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(to30(i, a) && to30(j, b)){
                    System.out.printf(
                            "a %d %s, b: %d %s",
                            a, opName(i), b, opName(j)
                    );
                }
            }
        }

    }
}
