
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // ======== Sum ========
        System.out.println("========== Addition =============");
        System.out.print("Enter the value of A:");
        int a = obj.nextInt();

        System.out.print("Enter the number of B:");
        int b = obj.nextInt();

        int sum = a + b;
        System.out.println("Your ans is:" + sum);


    }

}
