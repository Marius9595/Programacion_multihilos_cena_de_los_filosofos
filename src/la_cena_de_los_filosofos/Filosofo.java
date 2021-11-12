/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_cena_de_los_filosofos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class Filosofo extends Thread{
    
    int id;


    Palillo palillo_izquierda;
    Palillo palillo_derecha;

    public Filosofo() {
    }

    public Filosofo(Palillo palillo_izquierda, Palillo palillo_derecha,int id) {
        this.palillo_izquierda = palillo_izquierda;
        this.palillo_derecha = palillo_derecha;
        this.id = id;
    }
    
    
    
    @Override
    public void run() {
        
        
        for (int i = 0; i < 10; i++) {
            
            
            System.out.println("Filósofo " + id+ " piensa mientras intenta comer");

            try {
                palillo_izquierda.acquire(1);
                palillo_derecha.acquire(1);

            } catch (InterruptedException ex) {
                System.out.println(ex);
            }

            System.out.println("Filósofo " + id+ "  está comiendo");
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }

            palillo_izquierda.release(1);
            palillo_derecha.release(1);
            
            if( i == 9 ){
                System.out.println("Filósofo " + id+ "  dice que se marcha");
            }else{
                System.out.println("Filósofo " + id+ "  se pone a hablar");
                try {
                    sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            

        }
        
        System.out.println("Filósofo " + id+ "  se marcha de la cena");

    }

}
