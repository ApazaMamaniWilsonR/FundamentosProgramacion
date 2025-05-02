import java.util.*;

public class F27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nota 1:");
        int note1 = scanner.nextInt();
        System.out.println("nota 2:");
        int note2 = scanner.nextInt();
        System.out.println("nota 3:");
        int note3 = scanner.nextInt();
        System.out.println("nota 4:");
        int note4 = scanner.nextInt();

        int bestNote = Math.max(Math.max(note1, note2), Math.max(note3, note4));
        System.out.println("La nota mayor es " + bestNote);
    }
}
