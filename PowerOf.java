import java.util.Scanner;
 import java.io.*;
public class PowerOf {
     static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n=sc.nextInt();
    
        System.out.println(isPowerOfThree(n));
    }
}
