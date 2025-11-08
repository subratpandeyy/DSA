import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisor {
    public static void main(String args[]) {
        int n = 40;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0) {
                list.add(i);
                list.add(n/i);
            }
        }
        Collections.sort(list);
        System.out.print(list);
    }
}
