public class Prime {
    public static void main(String[] args) {
        int n = 12;
        int count = 0;
        for(int i = 1; i < n; i++) {
            if(n%i == 0) {
                count++;
            }
        }
        if(count > 1) {
            System.out.println("Not a Prime");
        }
        else {
            System.out.print("Prime Number");
        }
    }
}
