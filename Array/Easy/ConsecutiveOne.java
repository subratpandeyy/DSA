public class ConsecutiveOne {
  public static void main(String args[]) {
    int arr[] = {1,1,0,1,1,1};
    int n = arr.length;
    System.out.print("Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Max Consecutive Ones: " + findNum(arr,n));
  }

  public static int findNum(int arr[], int n) {
    int max = 0;
    int count = 0;
    for(int i=0;i<n;i++) {
      if(arr[i] == 1) {
        count+=1;
        max = count;
      }
      else {
        count = 0;
      }
    }
    return max;
  }
}
