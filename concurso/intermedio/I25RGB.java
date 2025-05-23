/* Crea las funciones capaces de transformar colores HEX a RGB y viceversa.
* Ejemplos:
RGB a HEX: r: 0, g: 0, b: 0 -#000000
HEX a RGB: hex:#000000 -> (r: 0, g: 0, b: 0)
*/
public class I25RGB {
    public static void main(String[] args) {
        int A=10,B=11,c=12,D=13,E=14,F=15;
        int[] r={F,F,F,F,F,F};
        rgb(r);
        int[] h={250,186,218};
        hex(h);
    }
    public static void rgb(int[] r) {
        int rojo=r[0]*16+r[1];
        int verde=r[2]*16+r[3];
        int azul=r[4]*16+r[5];
        System.out.println("("+rojo+","+verde+","+azul+")");
    }
    public static void hex(int[] h) {
        System.out.print("#");
        for (int i = 0; i < h.length; i++) {
            int n1=h[i]/16;
            int n2=h[i]%16;
            char c1=(n1<10)?(char)('0'+n1):(char)('A'+(n1-10));
            char c2=(n2<10)?(char)('0'+n2):(char)('A'+(n2-10));
            System.out.print(""+c1+c2);
        }
    }
}