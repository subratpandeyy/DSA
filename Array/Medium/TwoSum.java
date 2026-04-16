public class TwoSum {
  public static void main(String args[]) {
    int arr[] = {2,6,5,8,11};
    int n = arr.length;
    int target = 14;
    System.out.print("Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    int new_arr[] = findSum(arr,n,target);
    System.out.println(new_arr[0] + " " + new_arr[1]);
  }

  public static int[] findSum(int arr[], int n, int target) {
    int left = 0;
    int right = n-1;
    int sum = 0;
    while(arr[left] < arr[right]) {
      if(sum == target) return new int[] {left, right};
      if(sum < target) {
        left++;
      }
      else right--;
      sum = arr[left]+arr[right];
    }
    return new int[] {-1,-1};
  }
}
