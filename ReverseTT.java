import java.lang.ref.Cleaner;
import java.util.Scanner;
public class ReverseTT { 
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
        System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237\n");
         System.out.print("Enter Your Number:");
            int num = scan.nextInt();
            int reverse = 0;
            while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
             System.out.println("The reverse of the given number is: " + reverse); 
     }
 }
 


