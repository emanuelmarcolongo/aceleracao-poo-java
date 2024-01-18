import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(printFibonacci(5));
        System.out.println(printFibonacci(10));
        System.out.println(printFibonacci(20));
    }

    static List<Integer> printFibonacci(int num) {

        int a = 0;
        int b = 1;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            result.add(a);

            int next = a + b;
            a = b;
            b = next;
        }

        return result;
    }
}
