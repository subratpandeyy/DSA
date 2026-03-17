public class RotateByK {
  public static void main(String args[]) {
    int arr[] = {1,2,3,4,5,6,7};
    int k = 2;
    int n = arr.length;
    System.out.print("Original Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
    RotateMethod obj = new RotateMethod();
    obj.rotate(arr, k);
    System.out.print("Rotated Array: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}

class RotateMethod {
  public void rotate(int arr[], int k) {
    int n = arr.length;
    int temp[] = new int[k];
    //stores first k elems in temp array
    for(int i=0;i<k;i++) {
      temp[i] = arr[i];
    }
    //start rotation
    for(int i=k;i<n;i++) {
      arr[i-k] = arr[i];
    }
    //shift into og array
    for(int i=0;i<k;i++) {
      arr[n-k+i] = temp[i];
    }
  }
}
