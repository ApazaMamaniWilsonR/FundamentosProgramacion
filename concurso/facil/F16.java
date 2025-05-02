import java.util.*;

public class F16 {
    public static void main(String[] args) {
        System.out.println(findSecondGreater(List.of(4, 6, 1, 8, 10))); // 8
        System.out.println(findSecondGreater(List.of(4, 4, 4, 4, 4))); // null
    }

    public static Integer findSecondGreater(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        if (set.size() < 2) return null;
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList, Collections.reverseOrder());
        return sortedList.get(1);
    }
}
