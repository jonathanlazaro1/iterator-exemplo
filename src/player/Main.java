/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import musica.Cd;
import musica.CdDaXuxa;
import musica.Musica;
import java.util.Iterator;

/**
 *
 * @author jonathan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cd cd1 = new CdDaXuxa();
        
        Iterator<Musica> tocarCd = cd1.iterator();
        
        while(tocarCd.hasNext()){
            Musica m = tocarCd.next();
            m.tocar();
        }
    }
    
}
