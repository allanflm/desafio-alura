package br.com.allan.musicas.modelos;

public class Musica extends Audio {
    private String albun;
    private String cantor;
    private String genero;

    public String getAlbun() {
        return albun;
    }

    public void setAlbun(String albun) {
        this.albun = albun;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public double getClassificacao() {
        if(this.getTotalReproducoes() > 2000){
            return 10;
        }else{
            return 8;
        }
    }
}
