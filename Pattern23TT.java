import java.util.Scanner;

public class Pattern23TT {
    public static void main(String[] args)
    {
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                if( k == 1 || k == i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows-1; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = rows-1; k >= i; k--)
            {
                if( k == rows-1 || k == i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
