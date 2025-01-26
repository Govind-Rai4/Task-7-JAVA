import java.util.Scanner;

public class Task7b {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
            System.out.println("Input a single Character: ");
        char alpha =obj.next().charAt(0);

        if ((alpha >='A' && alpha <='Z')||(alpha >='a' && alpha <='z')) {
            System.out.println("It's a alphabet: ");
        }
        else{
            System.out.println("Not an alphabet");
        }
    }
}
