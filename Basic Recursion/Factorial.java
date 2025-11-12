public class Factorial {
    public static void main(String args[]) {
        int n = 5;
        Fact f = new Fact();
        System.out.println(f.factorial(n));
    }    
}

class Fact {
    public int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}