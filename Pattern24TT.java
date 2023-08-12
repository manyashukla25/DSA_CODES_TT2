public class Pattern24TT {
    public static void main(String[] args) {
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        int n = 5;
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {    
                if( k == 1 || k == i || i==n ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {  
                if( k == 1 || k == i || i==n ) { 
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
