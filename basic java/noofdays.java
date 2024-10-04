
import java.util.Scanner;

public class noofdays {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the month:");
        int n = obj.nextInt();
        int month[], i;
        month = new int[11];
        for (i = 0; i < month.length; i++) {
            if (i % 2 == 0 && i <= 6) {
                if (i == 1) {
                    month[i] = 28;
                }
                month[i] = 31;
            } else if (i % 2 != 0 && i >= 7) {
                month[i] = 31;
            } else {
                month[i] = 30;
            }
        }
        switch (n - 1) {
            case 0:
                System.err.println("January has " + month[n - 1] + " days");
                break;
            case 1:
                System.out.println("February has " + month[n - 1] + " days");
                break;
            case 2:
                System.out.println("march has " + month[n - 1] + " days");
                break;
            case 3:
                System.out.println("april has " + month[n - 1] + " days");
                break;
            case 4:
                System.out.println("may has " + month[n - 1] + " days");
                break;
            case 5:
                System.out.println("june has " + month[n - 1] + " days");
                break;
            case 6:
                System.out.println("july has " + month[n - 1] + " days");
                break;
            case 7:
                System.out.println("august has " + month[n - 1] + " days");
                break;
            case 8:
                System.out.println("September has " + month[n - 1] + " days");
                break;
            case 9:
                System.out.println("october has " + month[n - 1] + " days");
                break;
            case 10:
                System.out.println("November has " + month[n - 1] + " days");
                break;
            case 11:
                System.out.println("December has " + month[n - 1] + " days");
                break;
            default:
                throw new AssertionError();
        }

    }

}
