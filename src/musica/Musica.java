/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musica;

/**
 *
 * @author jonathan
 */
public class Musica {

    private final int numero;

    public Musica(int numero) {
        this.numero = numero;
    }
    
    public void tocar(){
        System.out.println(String.format("Tocando música %d", this.numero));
    }
}
