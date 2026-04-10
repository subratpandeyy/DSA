public class LongestSubArray {
  public static void main(String args[]) {
    int arr[] = {10, 5, 2, 7, 1, 9};
    int k = 15;
    int n = arr.length;
    System.out.print("Array: ");
    for(int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Longest SubArray: " + subArray(arr, n, k));
  }

  public static int subArray(int arr[], int n, int k) {
    int maxLength = 0;
    int left = 0;
    int right = 0;
    int sum = arr[0];
    while(right < n) {
      while(left <= right && sum > k) {
        sum -= arr[left];
        left++;
      }
      if (sum == k) {
        maxLength = Math.max(maxLength, right-left+1);
      }
      right++;
      if(right < n) {
        sum += arr[right];
      }
    }
    return maxLength;
  }
}
