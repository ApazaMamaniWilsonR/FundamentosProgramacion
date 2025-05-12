public class dificil3 {
    public static void main(String[] args) {
        String[] acciones = {"run", "jump","run", "jump", "run"};
        String pista = "__||_";

        boolean superada = evaluarCarrera(acciones, pista);
        if (superada) {
        System.out.println("¿Carrera superada? " +"si");}
        else{
        System.out.println("¿Carrera superada? " +"no");
        }
    }
    public static boolean evaluarCarrera(String[] acciones, String pista) {
        boolean ok = true;
        char[] resultado = pista.toCharArray();
        for (int i = 0; i < acciones.length; i++) {
            String accion = acciones[i];
            char obstaculo = pista.charAt(i);
            if (accion.equals("run") && obstaculo == '_') continue;
            else if (accion.equals("jump") && obstaculo == '|') continue;
            else if (accion.equals("jump") && obstaculo == '_') resultado[i] = 'x';
            else if (accion.equals("run") && obstaculo == '|') resultado[i] = '/';ok =false;
        }
        System.out.println(new String(resultado));
        return ok;
    }
    
}