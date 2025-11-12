public class Print1ton {
    public static void main(String[] args) {
        int n = 1000;
        int count = 0;
        PrinttoN r = new PrinttoN();
        r.printN(count, n);
    }
}

class PrinttoN {
    public void printN(int count, int n) {
        if(count == n) {
            return;
        }
        System.out.print(count + " ");
        printN(count + 1, n);
    }
}