/* Crea un programa se encargue de transformar un número binario a decimal sin utilizar 
funciones propias del lenguaje que lo hagan directamente.
 * 
*/
public class F17 {
    

    public static void binaryToDecimal(int n) {
        String respuesta="";
        while (n>0) {
            respuesta=(n%10)+respuesta;
            n=n/10;
        }
        System.out.println("el numero binario es: "+respuesta);
    }
    public static void main(String[] args) {
        binaryToDecimal(00110);
        
    }
}