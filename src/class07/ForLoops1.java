package class07;

public class ForLoops1 {
    public static void main(String[] args) {


        // using for loop print odd numbers from 1 to 20

        for (int i=0; i<20;i++) {
            if(i%2!=0){
                System.out.println(i);
            }
           }
        System.out.println("***************************************");
        for (int i=1; i<20 ; i+=2) {
            System.out.println(i);
        }

    }
}
