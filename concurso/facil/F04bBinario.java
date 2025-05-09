/*Crea un programa se encargue de transformar un número  decimal a binario sin utilizar funciones 
propias del lenguaje que lo hagan directamente.*/
import javax.swing.JOptionPane;
public class F04bBinario {
    public static void numeroBinario(int n) {
        String respuesta="";
        while (n>0) {
            respuesta=(n%2)+respuesta;
            n=n/2;
        }
        System.out.println("el numero binario es: "+respuesta);
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        numeroBinario(n);
    }
}