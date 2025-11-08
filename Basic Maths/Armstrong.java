public class Armstrong {
    public static void main(String[] args) {
        int n = 123;
        int num = n;
        int digit = 0;
        int sum = 0;
        while(n > 0) {
            digit = n % 10;
            sum = (int) (sum + Math.pow(digit, 3));
            n = n / 10;
        }
        if(sum == num) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }
}
