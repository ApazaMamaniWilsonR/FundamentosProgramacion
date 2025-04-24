public class Matriz {
    public static void main(String[] args) {
        String v="";
        int cx=0;
        int co=0;
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                int r=(int)(Math.random()*2);
                if (r==0){
                    v="x";
                    cx++;
                }else{
                    v="0";
                    co++;
                }
                System.out.print("["+v+"]");
                
            }  
            System.out.println();
        }
        System.out.println("cantidad de x: "+cx);
        System.out.println("cantidad de o: "+co);
        if(cx<co){
            System.out.println("el ganador es o");
        }else{
            System.out.println("el ganador es x");
        }
    }
}