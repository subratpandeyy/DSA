public class HighLowFreq {
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 5};
        boolean visited[] = new boolean[arr.length];
        int count = 0;
        int maxFreq = 0;
        int minFreq = arr.length;
        int maxVal = 0;
        int minVal = 0;

        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true) {
                continue;
            }

            count = 1;
            for(int j = i+1; j < visited.length; j++) {
                if(arr[j] == arr[i]) {
                    visited[j] = true;
                    count++;
                }
            }
            if(count > maxFreq) {
                maxVal = arr[i];
                maxFreq = count;
            }
            if(count < minFreq) {
                minVal = arr[i];
                minFreq = count;
            }
        }
        System.out.println("Max Value: " + maxVal + " " + "Max Frequency: " + maxFreq);
        System.out.println("Min Value: " + minVal + " " + "Min Frequency: " + minFreq);
    }
}
