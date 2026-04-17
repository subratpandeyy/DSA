public class MajorityElement {
  public static void main(String args[]) {
    int arr[] = {1, 1, 1, 2, 1, 2};
    int n = arr.length;
    System.out.print("Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Majority Element: " + findElement(arr,n));
  }

  static int findElement(int arr[], int n) {
    int count = 0;
    int element = 0;
    for(int i=0;i<n;i++) {
      if(arr[i] == element) {
        count++;
      }
      else if(arr[i] != element && count == 0) {
        element = arr[i];
      }
      else {
        count--;
      }
    }
    if(count > n/2) return element;
    return element;
  }
}
