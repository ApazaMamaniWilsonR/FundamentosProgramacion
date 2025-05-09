/* Obtener el IGV (18%) de una venta si esta es superior a S/ 150,000.00 aplicar un descuento 
del 25 %.
*/
import javax.swing.JOptionPane;
public class F25Venta {
    public static void main(String[] args) {
        int venta=Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio: "));
        double igv;
        double descuento=0;
        double total;
        igv=venta*0.18;
        if (venta>=150000) {
            descuento=venta*0.25;
        }
        total=venta-descuento+igv;
        System.out.println("IGV: "+igv+"\nDescuento: "+descuento+"\nTotal: "+total);
    }
}