package br.com.compartilhagram.Model;

import java.time.LocalDate;
import java.util.Scanner;

public class RedeSocial {

    public Usuario[] usuarioList = new Usuario[3];


    //Metodos

    public boolean verificarDisponibilidade(Usuario id) {
        boolean encontrou = true;
        for (int i = 0; i < usuarioList.length; i++) {
            if (usuarioList[i] != null && usuarioList[i].equals(id)) {
                encontrou = false;


            }
        }

        return encontrou;
    }

    public void exibirInfo() {

        System.out.println("== DADOS DO USUÁRIO ==");
        for (int i = 0; i < usuarioList.length; i++) {
            if (usuarioList[i] != null) {
                usuarioList[i].usuarioInfo();
            }
        }
    }

    public Usuario inserirUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("== CADASTRO DE USUÁRIOS ==");
        System.out.print("Nome: ");
        String nomeUser = sc.nextLine();
        System.out.print("E-mail: ");
        String emailUser = sc.nextLine();
        System.out.print("Data de Nascimento: ");
        String data = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(data);




        for (int i = 0; i < usuarioList.length; i++) {
            if (usuarioList[i] == null) {
                Usuario novo = new Usuario(nomeUser, emailUser, dataNascimento);
                usuarioList[i] = novo;
                System.out.println("Usuário cadastrado com sucesso!");
                exibirInfo();
                return novo;
            }
        }
        System.out.println("Não há espaço para mais usuários.");
        return null;
    }
}





