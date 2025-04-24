import javax.swing.JOptionPane;
public class Descuento {
    public static void main(String[] args) {
        double p=Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio:"));
        double d=Integer.parseInt(JOptionPane.showInputDialog("ingrese el porcentaje:"));
        
        double descuento=p-(p*(d/100));

        JOptionPane.showMessageDialog(null, "El precio final es: "+descuento);
    }
}