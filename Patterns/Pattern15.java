public class Pattern15 {
    public static void main(String args[]) {
        int n = 5;
        char alpha = 65;
        for(int i = 1; i <= 5; i++) {
            for(int j = n; j >= i; j--) {
                System.out.print(alpha + " ");
                alpha++;
            }
            System.out.println();
            alpha = 65;
        }
    }
}
// OUTPUT
// A B C D E 
// A B C D
// A B C
// A B
// A