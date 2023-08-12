public class Pattern13TT {
    public static void main(String[] args) {
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++) {
                System.out.print(" ");
            }
            for(int l=1; l<=i; l++) {   
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
