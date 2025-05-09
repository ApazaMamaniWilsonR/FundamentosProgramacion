/*Crea una función que reciba un número decimal y lo trasforme a Octal y Hexadecimal.
- No está permitido usar funciones propias del lenguaje de programación que realicen 
esas operaciones directamente..
*/
public class F22Bases {
    public static void octal(int numero){
        String respuesta="";
        int original=numero;
        while (numero>0) {
            respuesta=(numero%8)+respuesta;
            numero=numero/8;
        }
        System.out.println(original+" en octal es: "+respuesta);
    }
    public static void hexadecimal(int numero){
        String respuesta="";
        int original=numero;
        while  (numero>0) {
            respuesta=(numero%16)+respuesta;
            numero=numero/16;
        }
        System.out.println(original+" en hexadecimal es: "+respuesta);
    }
    public static void main(String[] args) {
        octal(100);
        hexadecimal(100);
    }
}