public class RemDupl {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 5};
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            arr[i] = arr[i];
            if(arr[i] == arr[i+1]) {
                arr[i] = arr[i+1];
            }
            System.out.println(arr[i]);
        }
    }
}
// NEEDS OPTIMIZATION