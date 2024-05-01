
import java.util.Scanner;


public class Multiplication {

    public static void main(String[] args)
     {
        Scanner obj = new Scanner(System.in);

        System.out.print(" Enter the value of A:");
        int a = obj.nextInt();

        System.out.print(" Enter the value of B:");
        int b = obj.nextInt();

        int Mul = a * b;
        System.out.print("Your ans is:" + Mul);
    }
}
