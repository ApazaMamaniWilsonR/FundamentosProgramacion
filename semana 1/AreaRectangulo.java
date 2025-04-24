import javax.swing.JOptionPane;
public class AreaRectangulo {
    public static void main(String[] args) {
        double b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el base"));
        double a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el saltura"));
        
        double area=b*a;

        JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+area);
    }
}