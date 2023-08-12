import java.util.Scanner;
public class Patter18TT {
    public static void main(String[] args)
    {
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        for (int i=1; i<= rows ; i++)
        {
            for (int j = rows; j >= i; j--) {
                if (j == rows || j == i || i == 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        //Close the resources
        sc.close();
    }
}
