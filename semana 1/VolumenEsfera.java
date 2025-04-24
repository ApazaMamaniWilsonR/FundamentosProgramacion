import javax.swing.JOptionPane;
public class VolumenEsfera {
    public static void main(String[] args) {
        double r=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer digito:"));
        
        double volumen=(4.0/3.0)*Math.PI*Math.pow(r,3);

        JOptionPane.showMessageDialog(null, "El volumen de la esfera es: "+volumen);
    }
}