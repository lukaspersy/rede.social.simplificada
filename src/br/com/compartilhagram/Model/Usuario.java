package br.com.compartilhagram.Model;

import java.time.LocalDate;
import java.util.Random;

public class Usuario {
    Random rd=new Random();
    int id=rd.nextInt(200);
    public String nomeUsuario;
    public String email;
    public String nomeReal;
    public LocalDate dataNascimento;

    public int[] listaAmigos = new int[12];
    public int[] listaMensagens = new int[10];
    public int[] listaFotos = new int[12];

    //Construtor
    public Usuario(String nomeReal, String email, LocalDate dataNascimento) {
        this.nomeUsuario = email.split("@")[0];
        this.nomeReal = nomeReal;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    //Metodo
    public void usuarioInfo(){
        System.out.println("ID: "+this.id);
        System.out.println("Nome: "+this.nomeReal);
        System.out.println("Nickname: "+this.nomeUsuario);
        System.out.println("E-mail: "+this.email);
        System.out.println("Data de Nascimento: "+this.dataNascimento);
        System.out.println("--".repeat(15));
    }
}