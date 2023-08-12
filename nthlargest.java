import java.util.Arrays;

public class nthlargest {
    public static int NthLargestElement(int arr[], int n, int k) {
    Arrays.sort(arr); 
    return arr[n - k]; 
  }

  public static void main(String[] args) {
    int arr[] = { 2, 1, 4, 6, 3, 9, 7 };
    int n = arr.length;
    int k = 2;
    int x = NthLargestElement(arr, n, k);
    System.out.print("Nth largest element is " + x);
  }
}
