package loops;

public class Ex5 {
    public static void main(String[] args){
        int size = 15;
        System.out.println("Triangle 1:");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Triangle 2:");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<=i; j++){
                if(i == (size -1) || (j == 0 || j == i)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("Rectangle with diagonals");

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i == 0 || (i == (size - 1))){
                    System.out.print("*");
                }
                else if(j == 0 || (j == (size - 1)) || (i == j) || (j == (size - 1 - i))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
