/* Crea 3 funciones, cada una encargada de detectar si una cadena de texto es un heterograma, 
un isograma o un pangrama.
- Debes buscar la definición de cada uno de estos términos.
*/
import java.util.*;
public class I21 {
    public static void main(String[] args) {
        System.out.println(esHeterograma("hiperblanduzcos ")); 
        System.out.println(esPangrama("hiperblanduzcós !!w "));            
        System.out.println(esIsograma("anna:")); 
        System.out.println(esPangrama("Benjamín pidió una bebida de kiwi y fresa. Noé, sin vergüenza, la más exquisita champaña del menú"));
    }
    public static boolean esHeterograma(String texto) {
        texto = texto.toLowerCase();
        Set<Character> letras = new HashSet<>();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!letras.add(c)) {
                    return false;  
                }
            }
        }
        return true;
    }

    public static boolean esIsograma(String texto) {
        texto = texto.toLowerCase();
        Map<Character, Integer> conteo = new HashMap<>();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                conteo.put(c, conteo.getOrDefault(c, 0) + 1);
            }
        }
        Set<Integer> frecuencias = new HashSet<>(conteo.values());
        return frecuencias.size() == 1 && !conteo.isEmpty();
    }

    public static boolean esPangrama(String texto) {
        texto = texto.toLowerCase();
        Set<Character> letras = new HashSet<>();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                letras.add(c);
            }
        }
        return letras.size() == 26; 
    }
}