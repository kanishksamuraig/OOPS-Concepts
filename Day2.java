
abstract class Mammal {

    void feeds() {
        System.out.println("Mammal feeds it's children with milk");
    }

    public abstract void walks();

}

class Doge extends Mammal {

    @Override
    void feeds() {
        System.out.println("Dog feeds it's puppy with gatorade");
    }

    @Override
    public void walks() {
        System.out.println("Dog walks");
    }

}

class Pussy extends Mammal {

    void feeds() {
        System.out.println("Pussy feeds it's baby with hehe");
    }

    public void walks() {
        super.feeds();
        System.out.println("Pussy walks");
    }
}

public class Day2 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Date date = new Date();
        // System.out.println(date.toString());
        // SimpleDateFormat ft = new SimpleDateFormat("dd");
        // if (date instanceof Date) {
        //     System.out.println("Reference variable is of type date:" + ft.format(date));
        // }
        Mammal dog = new Doge();
        Mammal cat = new Pussy();
        dog.walks();
        cat.walks();

    }
}
