public class App {
    public static void main(String[] args) throws Exception {
        Multiply(5);
    }

    static void Multiply(int num) {
        System.out.println("Tabela de multiplicação de: " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
