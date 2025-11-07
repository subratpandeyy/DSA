// public class Pattern22 {
//     public static void main(String args[]) {
//         int n = 7;
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n; j++) {
//                 if((i==1) || (j==1) || (i==n) || (j==n)) {
//                     System.out.print("4" + " ");
//                 }
//                 else if((i==2) || (j==2) || (i==n-1) || (j==n-1)) {
//                     System.out.print("3" + " ");
//                 }
//                 else if((i==3) || (j==3) || (i==n-2) || (j==n-2)) {
//                     System.out.print("2" + " ");
//                 }
//                 else {
//                     System.out.print("1" + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// OUTPUT
// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < 2*n-1; i++) {
            for(int j = 0; j < 2*n-1; j++) {
                int top = i;
                int bottom = j;
                int right = (2*n-2)-j;
                int left = (2*n-2)-i;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
}