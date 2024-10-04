
import java.util.Scanner;
//horizontal pyramidal shape

public class pattern {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner a = new Scanner(System.in);
        int i, j, n = a.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (i = n; i > 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
