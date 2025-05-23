/* Crea una función que encuentre todas las combinaciones de los números de una lista que suman 
el valor objetivo.
- La función recibirá una lista de números enteros positivos y un valor objetivo.
- Para obtener las combinaciones sólo se puede usar una vez cada elemento de la lista 
(pero pueden existir elementos repetidos en ella).
- Ejemplo: Lista = [1, 5, 3, 2],  Objetivo = 6
Soluciones: [1, 5] y [1, 3, 2] (ambas combinaciones suman 6)
(Si no existen combinaciones, retornar una lista vacía)
*/
import java.util.*;

public class I26Objetivo {
    public static void main(String[] args) {
        int[] numeros = {1,2,1,1,1,1,2,1};
        int objetivo = 6;

        Set<List<Integer>> resultado = new HashSet<>();
        encontrarCombinaciones(numeros, objetivo, 0, new ArrayList<>(), resultado);

        List<List<Integer>> combinaciones = new ArrayList<>(resultado);
        combinaciones.sort((a, b) -> b.size() - a.size());

        System.out.println(combinaciones);
    }

    public static void encontrarCombinaciones(int[] numeros, int objetivo, int indice, List<Integer> actual, Set<List<Integer>> resultado) {
        if (objetivo == 0) {
            List<Integer> copia = new ArrayList<>(actual);
            Collections.sort(copia);
            resultado.add(copia);
            return;
        }

        if (objetivo < 0 || indice >= numeros.length) return;
            actual.add(numeros[indice]);
            encontrarCombinaciones(numeros, objetivo - numeros[indice], indice + 1, actual, resultado);

            actual.remove(actual.size() - 1);
            encontrarCombinaciones(numeros, objetivo, indice + 1, actual, resultado);
    }
}