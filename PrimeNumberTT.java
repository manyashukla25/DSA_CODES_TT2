import java.util.Scanner;
public class PrimeNumberTT {
  public static void main(String[] args){
double i;
boolean isPrime = true;
System.out.println("Name:LAVANYA");
System.out.println("SAP ID:1000014237\n");
System.out.println("Enter the value of n: ");
    Scanner sc=new Scanner(System.in);
    double n=sc.nextDouble();

//0 nd 1 is not prime
if(n==0 || n==1)
{
    isPrime=false;
}

for(i=2 ; i<=n/2 ; i++)
{
    if(n%i==0)
    {
        isPrime=false;
        
    }
}
if(isPrime)
{
    System.out.println(n + " is a Prime Number.");
}
else
{
    System.out.println(n+ " is not a Prime Number");

  }  
  }
}
