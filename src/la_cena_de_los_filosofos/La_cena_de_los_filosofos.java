
package la_cena_de_los_filosofos;

/**
 *
 * @author Mario
 */
public class La_cena_de_los_filosofos {


    public static void main(String[] args) {
              
        Palillo[]  palillos  = crear_palillos(5);
        Filosofo[] filosofos = crear_filosofos_con_palillos(palillos);
        
        iniciar_cena(filosofos);
    }
    
    
    private static Palillo[] crear_palillos(int num_palillos){
        
        int permisos = 1;
        
        Palillo[] palillos = new Palillo[num_palillos];
        
        for (int i = 0; i < palillos.length; i++) {
            palillos[i] = new Palillo(permisos);
        }
        
        return palillos;       
    }
    
    
    private static Filosofo[] crear_filosofos_con_palillos(Palillo[]  palillos){
        
        Filosofo[] filosofos = new Filosofo[palillos.length];
        Palillo palillo_izquierda, pallillo_derecha;
        
        for (int i = 0; i < filosofos.length; i++) {
            
            if (i == 0){    
                palillo_izquierda = palillos[palillos.length-1];
                pallillo_derecha  = palillos[i];
            }else{               
                palillo_izquierda = palillos[i-1];
                pallillo_derecha  = palillos[i];
            }
            
            filosofos[i] = new Filosofo(palillo_izquierda, pallillo_derecha, i+1); 
        }
        
        return filosofos;
    }
    
    
    private static void iniciar_cena(Filosofo[] filosofos){
        
        for (Filosofo filosofo : filosofos) {          
            filosofo.start();         
        }       
    }
    
}
