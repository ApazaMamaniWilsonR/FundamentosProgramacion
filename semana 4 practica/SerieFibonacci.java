import javax.swing.JOptionPane;
public class SerieFibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int a=0;
        int b=1;
        int c;
        System.out.print("La serie fibonacci es: "+a);
        for (int i=1;i<n;i++) {
            System.out.print(" "+b);
            c=a+b;
            a=b;
            b=c;
        }
    }
}