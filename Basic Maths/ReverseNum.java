public class ReverseNum {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Given Number: " + n);
        int rev = 0;
        int ld = 0;
        while(n > 0) {
            ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }
        System.out.print("Reversed Number: " + rev);
    }
}
