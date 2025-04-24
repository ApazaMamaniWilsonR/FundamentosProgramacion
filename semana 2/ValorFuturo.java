import javax.swing.JOptionPane;
public class ValorFuturo {
    public static void main(String[] args) {
        double va=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor actual:"));
        double r=Integer.parseInt(JOptionPane.showInputDialog("ingrese la tasa de interes:"));
        double n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de periodos:"));
        
        double valor=va*Math.pow((1+(r/100)),n);

        JOptionPane.showMessageDialog(null, "El valor futuro es: "+valor);
    }
}