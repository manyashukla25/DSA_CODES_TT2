import java.util.Scanner;
public class Patter7TT {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        for (int i= 1; i<= rows ; i++)
        {
            for (int j=i; j < rows ;j++)          
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=rows; i>=1; i--)
        {
            for(int j=i; j<=rows;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<i ;k++) 
            {
                System.out.print("*");
            }
            System.out.println("");

        }

        //Close the resources
        sc.close();
    }
}
