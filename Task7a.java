    // 01-Input a string and check the first character
import java.util.Scanner;

    public class Task7a{
        public static void main(String[] args) {

            Scanner obj = new Scanner(System.in);
                System.out.print("Enter a string and character for check: ");
                String strng = obj.nextLine();
                char firstChar = strng.charAt(0);
        
                if (firstChar >= 'A' && firstChar <= 'Z') {
                    System.out.println("The first character is an uppercase letter.");
                }
                 else if (firstChar >= 'a' && firstChar <= 'z') {
                    System.out.println("The first character is a lowercase letter.");
                }
                //  else (firstChar >= '0' && firstChar <= '9') {
                //     System.out.println("The first character is a digit.");
                // }
                 else {
                    System.out.println("The first character is a special character.");
                }
}
}
