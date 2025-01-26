import java.util.Scanner;
public class Task7c {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char alpha = obj.next().charAt(0);

        if (alpha >='a' && alpha <='z') {
            System.out.println("lowercase: ");
        }
        else if (alpha >='A' && alpha <='Z') {
            System.out.println("UpperCase: ");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
