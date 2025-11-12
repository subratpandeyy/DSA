public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;
        ArrayReversal a = new ArrayReversal();
        a.reverseArr(arr, start, end);
        a.display(arr);
    }
}

class ArrayReversal {
    public void reverseArr(int arr[], int start, int end) {
        if(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            reverseArr(arr, start + 1, end - 1);
        }
    }

    public void display(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    } 
}