public class PrintNtime {
    public static void main(String[] args) {
        Recursive r = new Recursive();
        int count = 0;
        String name = "Subrat";
        int n = 5;
        r.Rec(count, name, n);
    }
}

class Recursive {
    public void Rec(int count, String name, int n) {
        if(count == n) {
            return;
        }
        System.out.println(name);

        Rec(count + 1, name, n);
    }
}