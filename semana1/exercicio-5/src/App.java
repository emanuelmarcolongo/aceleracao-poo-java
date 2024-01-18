public class App {
    public static void main(String[] args) throws Exception {
        String[] list1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] list2 = { "Manga", "Caqui", "Morango", "Amora" };

        printCommonElements(list1, list2);
    }

    static void printCommonElements(String[] list1, String[] list2) {

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]) {
                    System.out.println(list1[i]);
                }
            }
        }
    }
}
