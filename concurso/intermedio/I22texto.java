/* Crea un programa que analice texto y obtenga:
- Número total de palabras.
- Longitud media de las palabras.
- Número de oraciones del texto (cada vez que aparecen un punto).
- Encuentre la palabra más larga.
Todo esto utilizando un único bucle.*/

public class I22texto {
    public static void main(String[] args) {
        String texto = "Nos encontramos. en el congreso de. sistemas.";
        
        int numeroOraciones = texto.split("\\.").length - (texto.endsWith(".") ? 0 : 1);

        texto = texto.replace(".", "");
        String[] palabras = texto.split(" ");

        int numeroPalabras = palabras.length;

        int sumaLongitudes = 0;
        String palabraMasLarga = "";
        for (String palabra : palabras) {
            int longitud = palabra.length();
            sumaLongitudes += longitud;

            if (longitud > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        double longitudMedia = (double) sumaLongitudes / numeroPalabras;

        System.out.println("El número total de palabras: " + numeroPalabras);
        System.out.println("La longitud media es: " + longitudMedia);
        System.out.println("Número de oraciones: " + numeroOraciones);
        System.out.println("Palabra o palabras más largas son: [" + palabraMasLarga+"]");
    }
}