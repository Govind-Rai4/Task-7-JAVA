import java.util.Scanner;
public class Task7d {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Digit or Alphabet: ");
        char alpha =obj.next().charAt(0);

        if (alpha >= '0' && alpha <= '9') {
            System.out.println("It is a number: ");
        }
        else if ((alpha >= 'a' && alpha <='z')||(alpha >= 'A' && alpha <= 'Z')) {
            System.out.println("It is a Alphabet: ");
        }
        else {
            System.out.println("Something else: ");
        }
    }
}
