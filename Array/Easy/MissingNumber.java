public class MissingNumber {
  public static void main(String args[]) {
    int arr[] = {8, 2, 4, 5, 3, 7, 1};
    System.out.print("Array: ");
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    Missing obj = new Missing();
    obj.findNumber(arr);
  }
}

class Missing {
  public void findNumber(int arr[]) {
    int n = arr.length;
    int sum = 0;
    int defaultSum = (n+1)*(n+2)/2;
    for(int i=0;i<n;i++) {
      sum+=arr[i];
    }
    System.out.println("Missing Number: "+(defaultSum-sum));
  }
}
