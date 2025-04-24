import javax.swing.JOptionPane;

public class Actividad08 {
    public static void main(String[] args) {
        double p=Double.parseDouble(JOptionPane.showInputDialog("ingrese peso: "));
        double a=Double.parseDouble(JOptionPane.showInputDialog("ingrese altura: "));
        double IMC=p/Math.pow(a, 2);
        String r=String.format("%.2f", IMC);
        
        if (IMC<0){
            JOptionPane.showMessageDialog(null,"error");
        
        }else if (IMC>30){
            JOptionPane.showMessageDialog(null,"obesidad"+r);
        }else if (IMC>25){
            JOptionPane.showMessageDialog(null,"sobrepeso: "+r);
        }else if (IMC>18.5){
            JOptionPane.showMessageDialog(null,"normal: "+r);
        }else {
            JOptionPane.showMessageDialog(null,"bajo peso: "+r);
        }
        
    }
}