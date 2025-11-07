public class Pattern19 {
    public static void main(String args[]) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i; j--) {
                System.out.print("*" + " ");
            }
            // left spaces
            for(int k = (i-1); k >= 1; k--) {
                System.out.print("  ");
            }
            // right spaces
            for(int k = 2; k <= i; k++) {
                System.out.print("  ");
            }

            for(int k = n; k >= i; k--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // lower half
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            // left spaces
            for(int k = (n-i); k >= 1; k--) {
                System.out.print("  ");
            }
            // right spaces
            for(int k = (n-i); k >= 1; k--) {
                System.out.print("  ");
            }

            for(int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// OUTPUT
// * * * * * * * * * * 
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *
// *                 *
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *