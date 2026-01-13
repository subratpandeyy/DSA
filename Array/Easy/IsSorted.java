public class IsSorted {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,3};
        int n = arr.length;
        boolean isSort = false;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i+1] > arr[i]) {
                isSort = true;
            }
            else isSort = false;
        }
        System.out.println("Sorted array: " + isSort);
    }
}
