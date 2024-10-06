
import java.util.Scanner;

class box {

    double height;
    double breadth;
    double length;

    void volume(int x) {
        System.out.println("The volume of the box" + x + ":" + (height * breadth * length));
    }
}

public class boxdodo {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        box c = new box();
        box b = new box();
        box a = c;
        a.breadth = 10;
        a.length = 20;
        a.height = 30;
        System.out.print("Enter the height of box b:");
        b.height = x.nextInt();
        System.out.print("Enter the length of box b:");
        b.length = x.nextInt();
        System.out.print("Enter the breadth of box b:");
        b.breadth = x.nextInt();
        a.volume(1);
        b.volume(2);

    }
}
