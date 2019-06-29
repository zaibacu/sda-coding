import java.util.Scanner;

public class OddEven {
    public static int minValue(int[] array, int n){
        int m = 0;
        for(int j = 0; j<n; j++){
            if(array[m] > array[j]){
                m = j;
            }
        }

        return m;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<rows; i++){
            System.out.println("Enter numbers:");

            String lineIn = sc.nextLine();
            String[] buff = lineIn.split(" ");
            int evenCnt = 0;
            int oddCnt = 0;
            int[] numbers = new int[buff.length];
            int[] even = new int[buff.length];
            int[] odd = new int[buff.length];
            String[] results = new String[buff.length];
            for(int j=0; j<numbers.length; j++){
                numbers[j] = Integer.parseInt(buff[j]);
            }

            // Split into even and odd
            for(int number : numbers){
                if(number % 2 == 0){
                    even[evenCnt] = number;
                    evenCnt++;
                }
                else{
                    odd[oddCnt] = number;
                    oddCnt++;
                }
            }

            // Build result
            for(int k=0; k<numbers.length; k++){
                int m = 0;
                if(k % 2 == 0){
                    m = minValue(odd, oddCnt);
                    results[k] = new Integer(odd[m]).toString();
                    odd[m] = Integer.MAX_VALUE;
                }
                else{
                    m = minValue(even, evenCnt);
                    results[k] = new Integer(even[m]).toString();
                    even[m] = Integer.MAX_VALUE;
                }

            }
            sb.append(String.join("-", results) + "\n");
        }

        System.out.print(sb.toString());
    }
}
