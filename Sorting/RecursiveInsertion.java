public class RecursiveInsertion {
    public static void main(String args[]) {
        int arr[] = {5, 4, 6, 2, 1};
        int n = arr.length;

        System.out.print("Array before sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        insert(arr, 0, n);

        System.out.print("Array after sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insert(int arr[], int i, int n) {
        if(i == n ) return;

        int j = i;
        while(j > 0 && arr[j-1] > arr[j]) {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insert(arr, i+1, n);
    }
}
