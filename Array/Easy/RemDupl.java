public class RemDupl {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 4, 5, 5};
        int n = arr.length;
        Remove obj = new Remove();
        int output = obj.removeduplicates(arr);
        for(int i = 0; i < n-1; i++) {
            System.out.println(arr[i]);
            }
    }
}

class Remove {
    public int removeduplicates(int arr[]) {
        int n = arr.length;
        if(n == 0) return 0;

        // pointer for last unique element
        int i = 0;

        for(int j = 1;j < n;j++) {
            if(arr[j] != arr[i]) {
                i++;
            }
            arr[i] = arr[j];
        }
        return i+1;
    }
}

