public class RecursiveBubble {
    public static void main(String args[]) {
        int arr[] = {5, 4, 3, 7, 2, 1};
        int n = arr.length;

        System.out.print("Array before sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubble(arr, n);

        System.out.print("Array after sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubble(int arr[], int n){
        if(n == 1) {
            return;     // best case
        }
        // first parsing to send larget elem to last
        for(int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }

        // repreats the same algo by reducing one 
        bubble(arr, n-1);
    }
}
