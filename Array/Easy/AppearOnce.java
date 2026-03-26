import java.util.*;

public class AppearOnce {
  public static void main(String args[]) {
    int arr[] = {2,4,2,1,1};
    int n = arr.length;
    System.out.print("Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Element Appearing Once: " + findNum(arr,n));
  }

  public static int findNum(int arr[], int n) {
    int maxi = arr[0];

    // find max ele to find size of hash array
    for(int i=0;i<n;i++) {
      maxi = Math.max(arr[i], maxi);
    }

    // create a hash array
    int hash[] = new int[maxi+1];

    // count frequencies
    for(int i=0;i<n;i++) {
      hash[arr[i]]++;
    }

    for(int i=0;i<n;i++) {
      if(hash[arr[i]] == 1) {
        return arr[i];
      }
    }
    return -1;
  }
}
