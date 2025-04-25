import javax.swing.JOptionPane;

public class Examen03 {
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        int t=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));

        if (a+b+t==180){
            JOptionPane.showMessageDialog(null, "es triangulo");
        }else{
            JOptionPane.showMessageDialog(null, "no es triangulo");
        }
    }
}