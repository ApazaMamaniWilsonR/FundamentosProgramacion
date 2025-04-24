import javax.swing.JOptionPane;
public class NumeroValido {
    public static void main(String[] args) {
        int n;
        double aleatorio=(int)((Math.random()*20)+1);
        int intentos=0;
        do {
            n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            intentos++;
            if(intentos==5){
                System.out.println("game over :(");
                break;
            }
        }while (n!=aleatorio);
        if(aleatorio==n){
            System.out.println("Ud gano en: "+intentos+"");
        }else{
            System.out.println("sigue intentando...");
        }

    }
}