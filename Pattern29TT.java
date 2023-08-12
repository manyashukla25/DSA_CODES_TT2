import java.util.Scanner;
public class Pattern29TT {
        public static void main(String args[]){
           int i, j, my_input;
           System.out.println("Name:LAVANYA");
           System.out.println("SAP ID:1000014237\n");
           Scanner my_scanner = new Scanner(System.in);
           System.out.print("Enter the length of a side : ");
           my_input = my_scanner.nextInt();
           for(i = 1; i <= my_input; i++){
              for(j = 1; j <= my_input; j++){
                 System.out.print("*");
              }
              System.out.print("\n");
           }
        }
    }

