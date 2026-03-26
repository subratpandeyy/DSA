public class UnionOfArrays {
  public static void main(String args[]) {
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {2,4,5,6,7};
    int n = arr1.length;
    System.out.print("Array 1: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
    System.out.print("Array 2: ");
    for(int i=0;i<n;i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();

    Union obj = new Union();
    obj.union_method(arr1,arr2);

    System.out.println();
  }
}

class Union {
  public void union_method(int arr1[], int arr2[]) {
    int n = (arr1.length+arr2.length)/2;
    int union[] = new int[n];
    int i = 0, j = 0;
    while(n>0) {
      if(arr1[i] < arr2[j]) {
        if(arr1[i] != union[i]) {
          union[i] = arr1[i];
          i++;
        }
      }
      else {
        if(arr2[j] < arr1[i]) {
          if(arr2[j] != union[i]) {
            union[i] = arr2[j];
            j++;
          }
        }
      }
    }
    System.out.print("Union: ");
    for(int k=0;k<union.length;k++) {
      System.out.print(union[k] + " ");
    }
  }
}
