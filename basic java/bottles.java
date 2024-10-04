public class bottles{
    public static void main(String[] args){
        int bottles=99;
        String word="bottles";
        while(bottles>0){
            if(bottles==1){
                word="bottle";
            }
            System.out.println(bottles+" red "+word+" Hanging on the wall");
            System.out.println("And if one bottle should accidentally fall");
            bottles=bottles-1;
        }
        System.out.println("No more bottle is hanging on the wall");
    }
}