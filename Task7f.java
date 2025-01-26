import java.util.Scanner;

public class Task7f {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String: ");
        char alpha =obj.next().charAt(0);
        
        if (alpha >= 'A' && alpha <= 'Z') {
            System.out.println("It is UpperCase: ");
        }
        else if (alpha >= 'a' && alpha <= 'z') {
            System.out.println("It is Lower Case");
        }
        else if (alpha >= '0' && alpha <= '9') {
            System.out.println("It is a Digit: ");
        }
        else {
            System.out.println("Special Character: ");
        }
    }
}
