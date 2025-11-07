public class Pattern12 {
    public static void main(String args[]) {
        int n = 8;
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            for(int k = 1; k <= (n - (2*i)); k++) {
                System.out.print("  ");
            }
            for(int x = i; x >= 1; x--) {
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}

// OUTPUT
// 1             1 
// 1 2         2 1
// 1 2 3     3 2 1
// 1 2 3 4 4 3 2 1