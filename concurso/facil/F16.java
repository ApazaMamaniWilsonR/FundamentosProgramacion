/* Dado un listado de números, encuentra el SEGUNDO más grande       
*/       
import java.util.List;
public class F16 {
    public static Integer findSecondGreater(List<Integer> numeros) {
        if (numeros == null || numeros.size() < 2) return null;

        Integer mayor = null;
        Integer segundoMayor = null;

        for (Integer num : numeros) {
            if (mayor == null || num > mayor) {
                segundoMayor = mayor;
                mayor = num;
            } else if ((num < mayor) && (segundoMayor == null || num > segundoMayor)) {
                segundoMayor = num;
            }
        }
        return segundoMayor;
    }
    public static void main(String[] args) {
        System.out.println(findSecondGreater(List.of(4, 6, 1, 8, 10)));
        System.out.println(findSecondGreater(List.of(4, 4, 4, 4, 4)));
    }
}