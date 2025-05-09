enum PolygonType {
    SQUARE, TRIANGLE
}

public class F12 {
    public static void main(String[] args) {
        drawPolygon(10, PolygonType.SQUARE);
        drawPolygon(15, PolygonType.TRIANGLE);
    }

    public static void drawPolygon(int size, PolygonType type) {
        if (type == PolygonType.SQUARE) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (type == PolygonType.TRIANGLE) {
            for (int i = 1; i <= size; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}