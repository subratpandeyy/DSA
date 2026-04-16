public class SortDutchNationalFlag {
  public static void main(String args[]) {
    int arr[] = {1, 0, 2, 1, 0};
    int n = arr.length;
    System.out.print("Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    sortArray(arr,n);
    System.out.print("Sorted Array: ");
    for(int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void sortArray(int arr[], int n) {
    int low=0;
    int mid=0;
    int high=n-1;
    int temp = 0;
    while(mid <= high) {
      if(arr[mid] == 0) {
        temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
        low++;
        mid++;
      }
      else if(arr[mid] == 1) { 
        mid++;
      }
      else {
        temp = arr[high];
        arr[high] = arr[mid];
        arr[mid] = temp;
        high--;
      }
    }
  }
}
