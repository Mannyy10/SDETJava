package class05;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
        Write a program to find the largest number among three distinct numbers using nested if condition
        Please use Scanner class to take input from users
        */

        int number1=1, number2=2, number3=3;
        Scanner scanner=new Scanner(System.in);
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();

        if(number1>number2){
            if(number1>number3){
                System.out.println("Number is the largest "+number1 );
            }
        }
        if(number2>number1){
            if(number2>number3){
                System.out.println("Number 2 is largest "+number2);
            }
        }
        if(number3>number1){
            if(number3>number2){
                System.out.println("Number 3 is the largest "+number3);
            }
        }
    }
}
