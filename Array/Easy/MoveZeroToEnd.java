public class MoveZeroToEnd {
  public static void main(String args[]) {
    int arr[] = {1,2,0,3,0,4,5};
    int n = arr.length;
    System.out.print("Original Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    RotateArray obj = new RotateArray();
    obj.rotate(arr,n);
    System.out.print("Array with zeroes at end: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}

class RotateArray {
  public void rotate(int arr[], int n) {
    int j = 0;
    for(int i=0;i<n;i++) {
      if(arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }
    return;
  }
}
