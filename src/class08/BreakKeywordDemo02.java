package class08;

public class BreakKeywordDemo02 {
    public static void main(String[] args) {


        int temp = 75;

        while (temp<=105) {
            if (temp <= 100) {
                System.out.println("I love summer because temperature is "+ temp);
            } else {
                System.out.println("Its very hot "+temp);
            }
            temp += 5;
        }
    }
}

