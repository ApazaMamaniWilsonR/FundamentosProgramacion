import java.util.*;

public class F14 {
    public static void main(String[] args) {
        System.out.println(sort(new ArrayList<>(List.of(4, 6, 1, 8, 2)), true)); // Ascendente
        System.out.println(sort(new ArrayList<>(List.of(4, 6, 1, 8, 2)), false)); // Descendente
    }

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
}
