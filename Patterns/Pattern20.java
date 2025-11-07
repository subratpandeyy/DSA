public class Pattern20 {
    public static void main(String args[]) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // left space
            for(int k = (n-i); k >= 1; k--) {
                System.out.print("  ");
            }
            // right space
            for(int k = 1; k <= (n-i); k++) {
                System.out.print("  ");
            }
            for(int x = 1; x <= i; x++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // lower half
        for(int i = 1; i <= n-1; i++) {
            for(int j = n-1; j >= i; j--) {
                System.out.print("*" + " ");
            }
            // left space
            for(int k = (n-i); k <= n-1; k++) {
                System.out.print("  ");
            }
            // right space
            for(int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for(int x = (n-i); x >= 1; x--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// OUTPUT
// *                 * 
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *
