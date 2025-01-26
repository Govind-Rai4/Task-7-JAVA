import java.util.Scanner;

public class Task7g {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Whitesapce: ");
        char Special = obj.nextLine().charAt(0);

        if (Special == ' ' || Special == '\t' || Special == '\n') {
            System.out.println("Whitespace, tab, newline: ");
        }
        else {
            System.out.println("Not a Whitespace: ");
        }
    }
}
