/* Crea las funciones capaces de transformar colores HEX a RGB y viceversa.
* Ejemplos:
RGB a HEX: r: 0, g: 0, b: 0 -#000000
HEX a RGB: hex:#000000 -> (r: 0, g: 0, b: 0)
*/
public class I25RGB {
    public static void main(String[] args) {
        int B=11;
        int D=13;
        int E=14;
        int[] r={1,9,B,D,1,E};
        rgb(r);
        int[] h={25,189,30};
        hex(h);


    }
    public static void rgb(int[] r) {
        int rojo=(r[0]*16)+r[1];
        int verde=r[2]*16+r[3];
        int azul=r[4]*16+r[5];
        System.out.println("El equivalente es ("+rojo+","+verde+","+azul+")");
    }
    public static void hex(int[] h) {
        int r1=h[0]/16;
        int r2=h[0]%16;
        int g3=h[1]/16;
        int g4=h[1]%16;
        int b5=h[2]/16;
        int b6=h[2]%16;
        System.out.println(r1+","+r2+","+g3+","+g4+","+b5+","+b6);
    }
}