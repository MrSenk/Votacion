package votacion;

/**
 *
 * @author Camilo
 */
public class Votacion {

    public static void main(String[] args) {
        int arrayB;
        double votacionh,votacionm;
        arrayB = (int)(Math.random()*400)+100;
        char[][] rengo = new char[2][arrayB];
        double apruebh = 0;
        double apruebm = 0;
        double repruebm = 0;
        for(int i=0;i<arrayB;i++){
            votacionh = Math.random();
            votacionm = Math.random();
            if(votacionh<0.33){
                rengo[0][i] = '1';
            }else{
                if(votacionh<0.66){
                    rengo[0][i] = '0';
                }else{
                    if(votacionh<=1){
                        rengo[0][i] = 'n';
                }
            }
            if(votacionm<0.33){
                rengo[1][i] = '1';
            }else{
                if(votacionm<0.66){
                    rengo[1][i] = '0';
                }else{
                    if(votacionm<=1){
                        rengo[1][i] = 'n';
                    }    
                }
            }
        }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<arrayB;j++){
                if(rengo[0][j]=='1'){
                    apruebh = apruebh+1;
                }
                if(rengo[1][j]=='1'){
                    apruebm = apruebm+1;
                }
                if(rengo[1][j]=='0'){
                    repruebm = repruebm+1;
                }
            }
        }
        System.out.println("Hombres que aprueban la gestion: "+apruebh);
        System.out.println("Mujeres que desaprueban la gestion: "+repruebm);
        System.out.println("Porcentaje de aprobacion: "+((apruebh+apruebm)/(2*arrayB)*100)+"%");
        System.out.println("Numero de personas encuestadas: "+(2*arrayB));
    }
    
   }

