public class SumN {
    public static void main(String[] args) {
        int n = 5;
        SumFirstN s1 = new SumFirstN();
        s1.sum(n);
    }
}
class SumFirstN {
    public void sum(int n) {
        int summ = n*(n+1)/2;
        System.out.print(summ);
    }
}