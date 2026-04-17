public class KadaneAlgo {
  public static void main(String args[]) {
    int arr[] = {-2, -3, -7, -2, -10, -4};
    int n = arr.length;
    System.out.print("Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Max SubArray Sum: " + findSum(arr,n));
  }
  static int findSum(int arr[], int n) {
    int sum = 0;
    long max = Long.MIN_VALUE;
    for(int i=0;i<n;i++) {
      if(sum < 0) {
        sum = 0;
      }
      sum = sum+arr[i];
      if(sum > max) {
        max = sum;
      }
    }
    return (int) max;
  }
}
