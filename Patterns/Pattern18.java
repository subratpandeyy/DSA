public class Pattern18 {
    public static void main(String args[]) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(char alpha = (char) ('E'-i) ; alpha <= 'E'; alpha++) {
                System.out.print(alpha + " ");
            }
            System.out.println();
        }
    }
}

// OUTPUT
// E 
// D E
// C D E
// B C D E
// A B C D E