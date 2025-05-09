public class F11 {
    public static void main(String[] args) {
        System.out.println("**** 1 ****");
        for (int n = 1; n <= 100; n++) {
            System.out.println(n);
        }

        System.out.println("**** 2 ****");
        int n = 1;
        while (n<=100) {
            System.out.println(n);
            n++;
        }

        System.out.println("**** 3 ****");
        n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 100);

        System.out.println("**** 4 ****");
        int[] numeros=new int[100];
        for (int i=0;i<100;i++) {
            numeros[i]=i+1;
        }
        for (int num :numeros) {
            System.out.println(num);
        }
    }
}