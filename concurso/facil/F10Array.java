import java.util.ArrayList;
import java.util.List;

public class F10Array {
    public static void main(String[] args) {
        System.out.println(calculateSet(List.of(1, 2, 3, 3, 4), List.of(2, 2, 3, 3, 3, 4, 6), true));  // [2, 3, 4]
        System.out.println(calculateSet(List.of(1, 2, 3, 3, 4), List.of(2, 2, 3, 3, 3, 4, 6), false)); // [1, 6]
    }

    // Función que devuelve los elementos comunes o no comunes entre dos listas
    public static List<Integer> calculateSet(List<Integer> list1, List<Integer> list2, boolean findCommon) {
        List<Integer> result = new ArrayList<>();
        
        // Si se buscan los elementos comunes
        if (findCommon) {
            for (int num1 : list1) {
                if (list2.contains(num1) && !result.contains(num1)) {
                    result.add(num1);
                }
            }
        } else {
            // Si se buscan los elementos no comunes
            for (int num1 : list1) {
                if (!list2.contains(num1) && !result.contains(num1)) {
                    result.add(num1);
                }
            }
            for (int num2 : list2) {
                if (!list1.contains(num2) && !result.contains(num2)) {
                    result.add(num2);
                }
            }
        }

        return result;
    }
}
