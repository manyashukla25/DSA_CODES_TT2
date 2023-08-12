public class Patter17TT {
    public static void main(String[] args) {
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        int size = 5;
        for (int i = 1; i <= size; i++) {
          for (int j = 0; j < i; j++) {
      
            if (i != size) {
              if (j == 0 || j == i - 1) {
                System.out.print("*");
              } else {
                System.out.print(" ");
              }
            }
           
            else {
              System.out.print("*");
            }
          }
          System.out.println();
        }
      }
}
