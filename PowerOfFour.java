import java.util.*;
import java.util.Scanner;
public class PowerOfFour {
    static int isPowerOfFour(int n) {
       if(n == 0)
        return 0;
        while(n != 1)
        {
            if(n % 4 != 0)
            return 0;
            n = n / 4;    
        }
        return 1;
    }
 

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n=sc.nextInt();
      if(isPowerOfFour(n) == 1)
         System.out.println(n + " is a power of 4");
        else
         System.out.println(n + " is not a power of 4");
    }
}
