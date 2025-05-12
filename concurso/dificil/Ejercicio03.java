public class Ejercicio03 {
    public static void main(String[] args) {
        String pista="__|_|__";
        String[] atleta1={"run","jump","jump","run","run","run","run"};
        String[] atleta2={"run","run","jump","run","jump","run","run"};
        boolean resultado1=ganoCarrera(pista,atleta1);
        System.out.println(resultado1);
        boolean resultado2=ganoCarrera(pista,atleta2);
        System.out.println(resultado2);
        
    }
    public static boolean ganoCarrera(String pista,String[] atleta) {
        String carrera="";
        for (int i = 0; i < atleta.length; i++) {
            switch (atleta[i]) {
                case "run":
                    if (pista.charAt(i)=='_') {
                        carrera+="_";
                    } else {
                        carrera+="/";
                    }
                    break;
                case "jump":
                    if (pista.charAt(i)=='|') {
                        carrera+="|";
                    } else {
                        carrera+="x";
                    }
                    break;
            }
        }
        System.out.println(carrera);
        if (carrera.equals(pista)) {
            return true;
        } else {
            return false;
        }
    }
}
