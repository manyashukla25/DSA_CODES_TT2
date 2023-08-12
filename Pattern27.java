import java.util.Scanner;
public class Pattern27 {
    public static void main(String[] args)
    {
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        for (int i=1; i<= rows ; i++)
        {
            for (int j = rows; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }   
            if( i==1) {
                System.out.println("");
            }
            else {
                System.out.println("*");
            }
        }
        for (int i=rows-1; i>= 1 ; i--)
        {
            for (int j = rows; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }
            if( i==1)
                System.out.println("");
            else
                System.out.println("*");
        }

        //Close the resources
        sc.close();
    }
}
