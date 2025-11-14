public class Frequency {
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 5};
        boolean temp[] = new boolean[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(temp[i] == true) {
                continue;
            }

            count = 1;
            for(int j = i+1; j < temp.length; j++) {
                if(arr[j] == arr[i]) {
                    temp[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}