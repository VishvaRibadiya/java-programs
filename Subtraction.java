
import java.util.Scanner;

public class Subtraction {
   public static void main (String[] args)
   {
     Scanner obj = new Scanner(System.in);          //Scanner obj= new Scanner(System.in);

     System.out.print("Ente the value of A:");
     int a = obj.nextInt();

     System.out.print("Enter the value of B:");
     int b = obj.nextInt();
     
     int Minus = a-b;
     System.out.print("Your ans is: "+ Minus);
   }
}
