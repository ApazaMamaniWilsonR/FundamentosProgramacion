public class Ejercicio01 {
    public static void main(String[] args) {
        FibonassiIntertivo(50);
    }
    public static void FibonassiIntertivo(int cantidad) {
        long a=0;
        long b=1;
        long c;
        System.out.print(a);
        for (int i=1;i<cantidad;i++) {
            System.out.print(" "+b);
            c=a+b;
            a=b;
            b=c;
        }
    }
}