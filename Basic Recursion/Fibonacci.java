public class Fibonacci {
    public static void main(String args[]) {
        int n = 5;
        Fibo f = new Fibo();
        for(int i = 0; i < n; i++) {
            System.out.print(f.fibonacci(i) + " ");
        }
    }
}

class Fibo {
    public int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}