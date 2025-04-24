import javax.swing.JOptionPane;
public class VelocidadMedia {
    public static void main(String[] args) {
        int km=Integer.parseInt(JOptionPane.showInputDialog("ingrese los kilometros:"));
        int t=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tiempo:"));
        
        int velocidad=km/t;

        JOptionPane.showMessageDialog(null,"La velocidad media es: "+velocidad+" km/h");
    }
}