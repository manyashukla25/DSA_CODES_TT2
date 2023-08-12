public class NoOfInteger {
   public static int countIntegers(int n) {
        int count = 0;
        for (int x = 0; x <= n; x++) {
            if ((n & x) == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = countIntegers(n);
        System.out.println(result); 
    }
}
