import javax.swing.JOptionPane;
public class SumaNumerosFor {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int resultado=0;
        for(int i=1;i<=n;i++){
            resultado+=i;
        }
        JOptionPane.showMessageDialog(null,"la suma de todos los numeros es: "+resultado);
    }
}