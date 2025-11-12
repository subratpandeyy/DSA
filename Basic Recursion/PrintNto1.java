public class PrintNto1 {
    public static void main(String[] args) {
        int n = 10;
        PrintN p = new PrintN();
        p.printN(n);
    }
}

class PrintN {
    public void printN(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printN(n - 1);
    }
}
