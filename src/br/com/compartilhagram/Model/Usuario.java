package br.com.compartilhagram.Model;

import java.time.LocalDate;

public class Usuario {
    public String idUsuario;
    public String nomeUsuario;
    public String nomeReal;
    public LocalDate dataNascimento;

    public int []listaAmigos = new int[12];
    public int []listaMensagens = new int[10];
    public int []listaFotos = new int[12];

}