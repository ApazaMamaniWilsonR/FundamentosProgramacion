import javax.swing.JOptionPane;
public class Ejercicio11 {
    public static void main(String[] args) {
        int s=Integer.parseInt(JOptionPane.showInputDialog("ingrese los segundos: "));

        int horas=(int)(s/3600);
        int minutos=(int)((s%3600)/60);
        int segundos=(int)(s%60);

        JOptionPane.showMessageDialog(null,"Son las: "+horas+" con "+minutos+" minutos y "+segundos+" segundos");
    }
}