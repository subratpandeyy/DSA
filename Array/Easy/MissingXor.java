public class MissingXor {
  public static void main(String args[]) {
    int arr[] = {8, 2, 4, 5, 3, 7, 1};
    int n = arr.length;
    System.out.print("Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Missing number: " + findNum(arr,n));
  }

  public static int findNum(int arr[], int n) {
    int xor1 = 0;
    int xor2 = 0;
    for(int i=1;i<=n+1;i++) {
      xor1^=i;
    }
    for(int i=0;i<n;i++) {
      xor2^=arr[i];
    }
    return xor1^xor2;
  }
}
