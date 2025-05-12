public class Ejercicio04 {
    public static void main(String[] args) {
        String[][] matriz=crearMatriz();
        imprimirMatriz(matriz);
        calcularResultados(matriz);
    }
    public static String[][] crearMatriz() {
        String[][] matriz=new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int aleatorio=(int)(Math.random()*2)+1;
                if (aleatorio==1) {
                    matriz[i][j]="X";
                } else {
                    matriz[i][j]="O";
                }
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }
    public static void calcularResultados(String[][] matriz) {
        int cantidadX=0;
        int cantidadO=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("["+matriz[i][j]+"]");
                if (matriz[i][j]=="X") {
                    cantidadX++;
                }
                if (matriz[i][j]=="O") {
                    cantidadO++;
                }
            }
        }
        System.out.println("La cantidad de X es: "+cantidadX);
        System.out.println("La cantidad de O es: "+cantidadO);
        if (cantidadX>cantidadO) {
            System.out.println("GANA X");
        }else{
            System.out.println("GANA O");
        }
    }
}