
import java.util.Scanner;

public class TenaryOperator {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = obj.nextInt();
        String message = (age <= 18)
        ? "You are not Qualified to Election"
        : "You are Qualified to Election";

        System.out.println(message);

    }
}
