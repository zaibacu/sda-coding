package loops;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial value: ");
        double a = sc.nextInt();

        while(true){
            System.out.println("Enter divisor: ");
            int b = sc.nextInt();
            if(b == 0)
                break;
            a = a / b;
            System.out.printf("%.4f\n", a);
        }

    }
}
