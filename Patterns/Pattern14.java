public class Pattern14 {
    public static void main(String args[]) {
        int n = 5;
        char alpha = 65;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(alpha + " ");
                alpha++;
            }
            alpha = 65;
            System.out.println();
        }
    }
}

// OUTPUT
// A 
// A B
// A B C
// A B C D
// A B C D E