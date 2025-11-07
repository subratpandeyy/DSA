public class Pattern17 {
    public static void main(String args[]) {
        int n = 4;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n-i); j++) {
                System.out.print("  ");
            }

            char alpha = 'A';

            for(int k = 1; k <= i; k++) {
                System.out.print(alpha + " ");
                alpha++;
            }

            alpha -= 2;
            for(int x = 1; x < i; x++) {
                System.out.print(alpha + " ");
                alpha--;
            }
            System.out.println();
        }
    }
}

// OUTPUT
//         A 
//       A B A
//     A B C B A
//   A B C D C B A