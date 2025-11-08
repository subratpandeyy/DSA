import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        int ld = 0;
        while(n > 0) {
            ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }
        if(num == rev) {
            System.out.println(num + " is a Palindrome number");
        }
        else {
            System.out.println(num + " is not a Palindrome number");
        }
        sc.close();
    }
}
