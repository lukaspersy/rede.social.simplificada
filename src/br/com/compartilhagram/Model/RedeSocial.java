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

        System.out.println("\u001B[32m== DADOS DO USUÁRIO ==\u001B[m");
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
        System.out.print("Dia de Nascimento: ");
        int dia = sc.nextInt();
        System.out.print("Mês de Nascimento: ");
        int mes = sc.nextInt();
        System.out.print("Ano de Nascimento: ");
        int ano = sc.nextInt();
        LocalDate data = LocalDate.of(ano, mes, dia);

        for (int i = 0; i < usuarioList.length; i++) {
            if (usuarioList[i] == null) {
                Usuario novo = new Usuario(nomeUser, emailUser, data);
                usuarioList[i] = novo;
                System.out.println("\u001B[34mUsuário cadastrado com sucesso!\u001B[m");
                exibirInfo();
                return novo;
            }
        }
        System.out.println("Não há espaço para mais usuários.");
        return null;
    }
}





