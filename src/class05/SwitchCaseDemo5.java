package class05;
import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your gender m f");
        char gender=scanner.next().charAt(0);

        switch (gender){

            case 'f':
                System.out.println("Female");
                break;
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
                System.out.println("Males");
                break;
            case 'M':
                System.out.println("Males");
                break;
            default:
                System.out.println("not specified ");
        }



    }
    }
