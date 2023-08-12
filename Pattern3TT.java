import java.util.Scanner;

public class Pattern3TT {
   
    public static void main(String[] args)
    {
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: "); // takes input from user
        int rows = sc.nextInt();
        for (int i= 0; i<= rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println("");
        }
        sc.close();
    } 
    }
