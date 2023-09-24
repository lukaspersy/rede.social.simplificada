package br.com.compartilhagram.Model;

import java.time.LocalDateTime;

public class Foto {
    public Usuario autor;
    public String descricaoFoto;
    public LocalDateTime dataHora;
    public String urlImagem;

    //Construtor

    public Foto(Usuario autor, String descricaoFoto, LocalDateTime dataHora, String urlImagem) {
        this.autor = autor;
        this.descricaoFoto = descricaoFoto;
        this.dataHora = dataHora;
        this.urlImagem = urlImagem;
    }

    //Metodo
    public void exibirInfo(){

    }
}
