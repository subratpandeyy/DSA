public class leftRotate {
  public static void main(String args[]) {
    int arr[] = {1,2,3,4,5};
    System.out.print("Original array: ");
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    Rotate obj = new Rotate();
    obj.rotateArray(arr);
    System.out.print("Array after left shift: ");
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
  }
}

class Rotate {
  public void rotateArray(int arr[]) {
    int n = arr.length;
    int temp = arr[0];
    for(int i=0;i<n-1;i++) {
        arr[i] = arr[i+1];
    }
    arr[n-1] = temp;
    return;
  }
}
