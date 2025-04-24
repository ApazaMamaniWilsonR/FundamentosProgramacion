import javax.swing.JOptionPane;
public class Ejercicio19 {
    public static void main(String[] args) {
        int s=Integer.parseInt(JOptionPane.showInputDialog("ingrese el salario:"));
        int p=Integer.parseInt(JOptionPane.showInputDialog("ingrese el porcentaje:"));

        int ganancia=((s*p)/100)+s;

        JOptionPane.showMessageDialog(null, "Debe vender el producto a: S/: "+ganancia);
    }
}