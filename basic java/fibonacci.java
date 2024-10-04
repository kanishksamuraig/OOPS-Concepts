
import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        System.out.print("No of terms to be printed in the fibonacci series:");
        Scanner obj = new Scanner(System.in);
        int a = -1, b = 1, c, n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            if (i == n - 1) {
                System.out.print(c);
                break;
            }
            System.out.print(c + ",");
        }
    }
}
