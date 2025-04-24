import javax.swing.JOptionPane;

public class AlgoritmosF03 {
    public static void main(String[] args) {

        String texto=JOptionPane.showInputDialog("ingrese el texto");
        //String contrario=new StringBuilder(texto).reverse().toString(); seria una funcion propia del lenguaje
        String contrario="";
        /* i es el inicio del texto; texto.length() cuenta cuantas letras tiene; -1 es el final del texto
        i>=0 asegura que el bucle recorra todos los caracteres y i-- resta un valor a i  */
        for(int i=texto.length()-1;i>=0;i--){
            // charAt(i) debuelve el texto invertido en el orden del prinsipio
            contrario+=texto.charAt(i);
        }
        JOptionPane.showMessageDialog(null,"El texto invertido es: "+contrario);;
    }
}