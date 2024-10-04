
import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr1[][] = new int[3][3], arr2[][] = new int[3][3], x, i;
        int arr3[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        System.out.println("Enter the elements of the first matrix");
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.print("arr1 " + (i + 1) + "" + (j + 1) + ":");
                x = obj.nextInt();
                arr1[i][j] = x;
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.print("arr2" + (i + 1) + "" + (j + 1) + ":");
                x = obj.nextInt();
                arr2[i][j] = x;
            }
        }
        System.out.println("The below is the result of the multiplication of the two matrices");
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];

                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
