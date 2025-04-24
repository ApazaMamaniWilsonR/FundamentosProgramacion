import javax.swing.JOptionPane;

public class FactorialForPractica {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        JOptionPane.showMessageDialog(null, "El factorial es: "+factorial);
    }
}