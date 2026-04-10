import java.util.*;

public class LongestSubH {
  public static void main(String args[]) {
    int arr[] = {9, -3, 3, -1, 6, -5};
    int n = arr.length;
    int k = 6;
    System.out.print("Array: ");
    for(int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Longest Sub Array: " + longestSubArray(arr, n, k));
  }

  public static int longestSubArray(int arr[], int n, int k) {
    Map<Integer, Integer> mpp = new HashMap<>();
    int maxLength = 0;
    int sum = 0;
    for(int i=0;i<n;i++) {
      sum += arr[i];

      if(sum == 0) {
        maxLength = i+1;
      }
      else {
        if(mpp.containsKey(sum)) {
          maxLength = Math.max(maxLength, i-mpp.get(sum));
        }
        else {
          mpp.put(sum, i);
        }
      }
    }
    return maxLength;
  }
}
