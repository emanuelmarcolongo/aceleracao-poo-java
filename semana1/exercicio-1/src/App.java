public class App {
    public static void main(String[] args) {
        System.out.println(verifyNumber(2));
        System.out.println(verifyNumber(1));
        System.out.println(verifyNumber(-0));
        System.out.println(verifyNumber(-1));
        System.out.println(verifyNumber(-2));
    }

    static String verifyNumber(int num) {

        if (num == 0) {
            return "O numero 0 é neutro";
        }

        boolean isEven = (num % 2) == 0;
        boolean isPositive = num > 0;

        String message = "O numero " + num + " é " + (isEven ? " par " : " impar ") + " e "
                + (isPositive ? " positivo " : " negativo ");
        return message;
    }
}
