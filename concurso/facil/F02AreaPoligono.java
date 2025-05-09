/* Crea una única función (importante que sólo sea una) que sea capaz de calcular y retornar 
el área de un polígono.
 - La función recibirá por parámetro sólo UN polígono a la vez.
 - Los polígonos soportados serán Triángulo y Rectángulo.
 - Imprime el cálculo del área de un polígono de cada tipo.
*/
import javax.swing.JOptionPane;
public class F02AreaPoligono  {
    public static double areaPoligono(String poligono) {
        double area=0;
        int base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese base"));
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura"));
        if (poligono.equals("Triángulo")){
            area=base*altura/2;
        }else if (poligono.equals("Rectángulo")){
            area=base*altura;
        }
        return area;

    }
    public static void main(String[] args)  {
        double areat=areaPoligono("Triángulo");
        System.out.println("El area del triangulo es: "+areat);
        double arear=areaPoligono("Rectángulo");
        System.out.println("El area del rectangulo es:"+arear);
    }
}