
import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print(" Enter the value of A:");
        int a = obj.nextInt();

        System.out.print(" Enter the value of B:");
        int b = obj.nextInt();

      int Div = a/b;
        System.out.print(" Your ans is: " + Div);

    }
}
