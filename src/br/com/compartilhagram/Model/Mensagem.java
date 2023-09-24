package br.com.compartilhagram.Model;

import java.time.LocalDateTime;

public class Mensagem {
     public Usuario autor;
     public String conteudoMensagem;
     public LocalDateTime dataHoraPublicacao;

     public void exibirinfo(){
         System.out.println("Autor: " + autor);
         System.out.println("Conteúdo da Mensagem" + conteudoMensagem);
         System.out.println("Data e Hora da Publicação:" + dataHoraPublicacao);
     }
}
