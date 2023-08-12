import java.util.Scanner;
public class Pattern26TT {
    public static void main(String[] args)
    {
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
         for (int i=rows; i>= 1 ; i--)
        {
            for (int j = i; j < rows ; j++) {
                System.out.print(" ");
            }   
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == rows || k==(2*i-1)) {
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
