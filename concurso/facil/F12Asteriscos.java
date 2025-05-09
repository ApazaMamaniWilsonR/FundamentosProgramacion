/*  Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
EXTRA: ¿Eres capaz de dibujar más figuras?
*/
public class F12Asteriscos {
    public static void drawPolygon(int columnas, String tipo) {
        if (tipo.equalsIgnoreCase("SQUARE")) {
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        drawPolygon(10, "SQUARE");
    }
}