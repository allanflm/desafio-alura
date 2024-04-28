package br.com.allan.musicas.main;

import br.com.allan.musicas.modelos.MinhasPreferidas;
import br.com.allan.musicas.modelos.Musica;
import br.com.allan.musicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Like a Stone");
        minhaMusica.setCantor("chris cornell");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);

    }
}
