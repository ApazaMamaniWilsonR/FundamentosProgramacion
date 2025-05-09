/* Crea un programa se encargue de transformar un número binario a decimal sin utilizar 
funciones propias del lenguaje que lo hagan directamente.
 * 
*/
public class F17Base10 {
    public static void base10(int numeroBinario){
        int decimal = 0;
        int potencia = 0;
        while (numeroBinario > 0) {
            int digito = numeroBinario % 10;
            
            decimal += digito * Math.pow(2, potencia);
            numeroBinario /= 10;
            potencia++;
        }
        System.out.println("El número en base 10 es: " + decimal);
    }
    public static void main(String[] args) {
        base10(110);
        base10(1100);
    }
}