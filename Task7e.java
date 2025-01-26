import java.util.Scanner;

public class Task7e {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Special character");
        char Special =obj.next().charAt(0);

        if ((Special >='a' && Special <= 'z')||(Special >= 'A' && Special <='Z')) {
            System.out.println("Alphabet: ");
        }
        else {
            System.out.println("Special character: ");
        }
    }
}
