public class LargestElem {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 5, 3};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element: " + max);
    }
}
