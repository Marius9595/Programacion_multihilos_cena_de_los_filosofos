/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_cena_de_los_filosofos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Mario
 */
public class Palillo extends Semaphore{
    
    public Palillo(int i) {
        super(i);
    }
    
}
