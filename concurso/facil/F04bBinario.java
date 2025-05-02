import javax.swing.JOptionPane;
public class F04bBinario {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        String respuesta="";
        while (n>0) {
            /*como los numeros binarios se escriben de derecha a izquierda se pone: respuesta=(n%2)+respuesta
            si fuera lo normal de izquierda a derecha se usaria: respuesta+=(n%2) */
            respuesta=(n%2)+respuesta;
            n=n/2;
        }
        System.out.println("el numero binario es: "+respuesta);
    }
}