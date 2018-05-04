/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musica;

import java.util.Iterator;

/**
 *
 * @author jonathan
 */
public abstract class Cd implements Iterable<Musica> {

    private final Musica[] musicas;

    public Cd(int qtdMusicas) {
        this.musicas = new Musica[qtdMusicas];
        for (int i = 0; i < qtdMusicas; i++) {
            this.musicas[i] = new Musica(i + 1);
        }
    }

    @Override
    public Iterator<Musica> iterator() {
        return new CdIterator();
    }

    private class CdIterator implements Iterator<Musica> {

        private int musicaAtual;

        private CdIterator() {
            this.musicaAtual = 0;
        }

        @Override
        public boolean hasNext() {
            if (this.musicaAtual < musicas.length) {
                return true;
            }
            return false;
        }

        @Override
        public Musica next() {
            if (this.hasNext()) {
                return musicas[musicaAtual++];
            } else {
                return null;
            }
        }

    }
}
