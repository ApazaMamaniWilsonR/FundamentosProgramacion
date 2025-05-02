public class F11 {
    public static void main(String[] args) {
        System.out.println("**** 1 ****");
        for (int index = 1; index <= 100; index++) {
            System.out.println(index);
        }

        System.out.println("**** 2 ****");
        int index = 1;
        while (index <= 100) {
            System.out.println(index);
            index++;
        }

        System.out.println("**** 3 ****");
        index = 1;
        do {
            System.out.println(index);
            index++;
        } while (index <= 100);
    }
}
