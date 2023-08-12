import java.util.Scanner;
public class ReportCardTT {

public static void main(String[] args) {
    System.out.println("Name: LAVANYA");
    System.out.println("SAPID: 1000014237\n");
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the name of the person : ");  
String str= sc.nextLine();
System.out.print("Enter roll no of student: ");
int r = sc.nextInt();
System.out.println("Enter the marks of first subject: ");
int a = sc.nextInt();
System.out.println("Enter the marks of second subject : ");
int b = sc.nextInt();
System.out.println("Enter the marks of third subject: ");
int c = sc.nextInt();

double total=a+b+c;
double percentage =((total*100)/300);
{
if(percentage >= 90)
        {
            System.out.println("Grade : A");
        }
        else if( 70 <= percentage && percentage < 90)
        {
            System.out.println("Grade : B");
        }
        else if( 60 <= percentage && percentage < 70)
        {
            System.out.println("Grade : C");
        }
        else if( 50 <= percentage && percentage < 60)
        {
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : F");
        }
        System.out.println("Total Marks out of 300 : "+total);
        System.out.println("percent out of 100% : "+percentage);
        System.out.println();
        System.out.println("-----------------------------");

}
}
}