package class09;

public class ArrayDemo04 {
    public static void main(String[] args) {

        // Create an array to store the letters A B C D E F

        char[] letters={'A','B','c','d','e','F'};
        letters[0]='z'; // updating the element at index 0
        for (int i = 0; i <letters.length ; i++) {
            System.out.println(letters[i]);

        }


    }
}
