public class App {
    public static void main(String[] args) throws Exception {
        numberPyramid(5);
    }

    static void numberPyramid(int num) {

        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }

    }
}
