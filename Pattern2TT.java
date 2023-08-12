import java.util.Scanner;

public class Pattern2TT {
    public static void main(String[] args)
    {
    System.out.println("Name:LAVANYA");
    System.out.println("SAP ID:1000014237\n");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: "); //takes input from user
    int rows = sc.nextInt();
    for (int i= rows-1; i>=0 ; i--)
    {
    for (int j=0; j<=i; j++)
    {
    System.out.print("*" + " ");
    }
    System.out.println();
    }
    sc.close();
    }
}