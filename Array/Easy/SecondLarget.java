public class SecondLarget {
    public static void main(String args[]) {
        int arr[] = {1, 5, 2, 7, 3};
        int max_1 = arr[0];
        int max_2 = arr[0];
        int n = arr.length;
        for(int i = 0; i < n; ++i) {
            if(arr[i] > max_1) {
                max_2 = max_1;
                max_1 = arr[i];
            }
            else if(max_2 < arr[i] && arr[i]!=max_1) {
                max_2 = arr[i];
            }
        }
        
        System.out.println("Second Largest element: " + max_2);
    }
}
