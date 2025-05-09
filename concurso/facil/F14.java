/* Crea una función que ordene y retorne una matriz de números.
La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro  adicional "Asc" o "Desc"
para indicar si debe ordenarse de menor a mayor o de mayor a menor.
No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.*/
import java.util.*;
public class F14 {
    
    public static List<Integer> sort(List<Integer> list, boolean asc) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((asc && list.get(i) > list.get(j)) || (!asc && list.get(i) < list.get(j))) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(sort(new ArrayList<>(List.of(4,6,1,8,2)),true));
        System.out.println(sort(new ArrayList<>(List.of(4,6,1,8,2)),false));
    }
}