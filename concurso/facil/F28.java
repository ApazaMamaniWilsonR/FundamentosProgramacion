import java.util.*;

public class F28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("primera nota:");
        double note1 = scanner.nextDouble();
        System.out.println("segunda nota:");
        double note2 = scanner.nextDouble();
        System.out.println("tercera nota:");
        double note3 = scanner.nextDouble();

        double average = (note1 + note2 + note3) / 3;
        if (average >= 17) {
            System.out.println("Aprobado con " + average);
        } else {
            System.out.println("Reprobado con " + average);
        }
    }
}
