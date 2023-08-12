    import java.util.Scanner;
    public class PrimeNumber1toNTT {
    public static void main(String[] args){
    System.out.println("Name:LAVANYA");
    System.out.println("SAP ID:1000014237\n");
    System.out.print("Enter the number : ");
    int i,j,fact;
    boolean isPrime=true;
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for(i=1 ; i<=n ; i++)
        {
            fact = 0;
            for(j=1 ; j<=n ; j++)
            {
                if(i%j==0)
                {
                    fact++;
                }
            }
            if(fact ==2)
            {
                System.out.println(i);
            }
        }
        
    }
}

