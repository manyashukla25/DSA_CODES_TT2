public class Patter9TT {
  public static void main(String[] args) {
    System.out.println("Name:LAVANYA");
    System.out.println("SAP ID:1000014237\n");
    int size = 5;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
