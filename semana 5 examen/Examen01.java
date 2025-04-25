import javax.swing.JOptionPane;

public class Examen01 {
    public static void main(String[] args) {
        int km=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));

        double millas=km*0.621371;

        JOptionPane.showMessageDialog(null, "Las milas son: "+millas);
    }
}