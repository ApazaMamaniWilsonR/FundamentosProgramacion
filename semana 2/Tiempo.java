import javax.swing.JOptionPane;
public class Tiempo {
    public static void main(String[] args) {
        int m=Integer.parseInt(JOptionPane.showInputDialog("ingrese los minutos:"));
        
        int horas=(int)(m/60);
        int minutos=(int)(m%60);

        JOptionPane.showMessageDialog(null, "Son las: "+horas+" horas y "+minutos+" minutos");
    }
}