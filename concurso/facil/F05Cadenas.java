/*Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas 
como salida (out1, out2).
- out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
- out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.*/
public class F05Cadenas {
    public static void iguales(String texto1, String texto2 ) {
        String extraido1="";
        String extraido2="";
        for (int i = 0; i < texto1.length(); i++) {
            if (texto2.indexOf(texto1.charAt(i))==-1) {
                extraido1+=texto1.charAt(i);
            }
        }
        System.out.println("Letras extraidas1: "+extraido1);

        for (int i = 0; i < texto2.length(); i++) {
            if (texto1.indexOf(texto2.charAt(i))==-1) {
                extraido2+=texto2.charAt(i);
            }
        }
        System.out.println("Letras extraidas2: "+extraido2);
    }
    public static void main(String[] args) {
        String texto1="me gusta java";
        String texto2="me gusta kotlin";
        iguales(texto1, texto2);
    }   
}