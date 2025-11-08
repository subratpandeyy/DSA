public class CountDigits {
    public static void main(String args[]) {
        int n = 1245;
        System.out.println("Given number: " + n);
        int digit = 0;
        while(n > 0) {
            digit++;
            n = n / 10;
        }
        System.out.print("Length of number: " + digit);
    }
}
