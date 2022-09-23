import java.util.Scanner;

/**
 * Projeto para a cadeira de Laboratório 1 da faculdade. 
 * O objetivo é criar um app de cadastro de alunos para
 * uma startup ficticia chamada Fun4Study
 * 
 * @author Esther J. Dorneles 
 * @version 20/09/22
 */
public class TesteFun4Study
{

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // variaveis cidade
        int cod1;
        String desc1;
        String uF1;

        // variaveis estudantes
        int codE1;
        String nome;
        String dataNasc;
        String email;
        String senha;

        // Cadastro cidade 1
        System.out.println("\nCadastre a cidade 1: ");
        System.out.println("Informe o codigo: ");
        cod1 = leia.nextInt();
        leia.nextLine();
        System.out.println("Informe a descricao: ");
        desc1 = leia.nextLine();
        System.out.println("UF: ");
        uF1 = leia.nextLine();
        Cidade c1 = new Cidade(cod1, desc1, uF1);

        //variaveis estudante1
        System.out.println("\nCadastre Estudante1: ");
        System.out.println("Informe o codigo: ");
        codE1 = leia.nextInt();
        leia.nextLine();
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        System.out.println("Data de Nascimento: ");
        dataNasc = leia.nextLine();
        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leia.nextLine();
        Estudante e1 = new Estudante(codE1, nome, dataNasc, email, senha, c1);
        e1.atualizaSenha();


        //cadastro estudante2
        System.out.println("\nCadastre Estudante 2: ");
        System.out.println("Informe o codigo: ");
        codE1 = leia.nextInt();
        leia.nextLine();
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        System.out.println("Data de Nascimento: ");
        dataNasc = leia.nextLine();
        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leia.nextLine();
        Estudante e2 = new Estudante(codE1, nome, dataNasc, email, senha, c1);
        e2.atualizaSenha();

        // variaveis cidade2
        System.out.println("\nCadastre a cidade 2: ");
        System.out.println("Informe o codigo: ");
        cod1 = leia.nextInt();
        leia.nextLine();
        System.out.println("Informe a descricao: ");
        desc1 = leia.nextLine();
        System.out.println("UF: ");
        uF1 = leia.nextLine();
        Cidade c2 = new Cidade(cod1, desc1, uF1);

        //variaveis estudante3
        System.out.println("\nCadastre Estudante 3: ");
        System.out.println("Informe o codigo: ");
        codE1 = leia.nextInt();
        leia.nextLine();
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        System.out.println("Data de Nascimento: ");
        dataNasc = leia.nextLine();
        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leia.nextLine();
        Estudante e3 = new Estudante(codE1, nome, dataNasc, email, senha, c2);
        e3.atualizaSenha();

        //variaveis estudante4
        System.out.println("\nCadastre Estudante 4: ");
        System.out.println("Informe o codigo: ");
        codE1 = leia.nextInt();
        leia.nextLine();
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        System.out.println("Data de Nascimento: ");
        dataNasc = leia.nextLine();
        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leia.nextLine();
        Estudante e4 = new Estudante(codE1, nome, dataNasc, email, senha, c2);
        e4.atualizaSenha();


        System.out.println("\n\nCidade 1:");
        c1.exibeDados();
        System.out.println("\nEstudante 1:");
        e1.exibeDados();
        System.out.println("\nEstudante 2:");
        e2.exibeDados();
        System.out.println("\n\nCidade 2:");
        c1.exibeDados();
        System.out.println("\nEstudante 1:");
        e3.exibeDados();
        System.out.println("\nEstudante 2:");
        e4.exibeDados();

    }
}