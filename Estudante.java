import java.util.Scanner;

/**
 * Projeto para a cadeira de Laboratório 1 da faculdade. 
 * O objetivo é criar um app de cadastro de alunos para
 * uma startup ficticia chamada Fun4Study
 * 
 * @author Esther J. Dorneles 
 * @version 20/09/22
 */
public class Estudante
{
    // atributos
    private int codigo;
    private String nome;
    private String dataNasc;
    private String email;
    private String senha;
    private Cidade cidade;

    // construtor: 
    public Estudante(int codigo, String nome, String dataNasc,
    String senha, String email, Cidade cidade)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        cidade.addNovoAluno();
    }
    // métodos
 
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getDataNasc()
    {
        return dataNasc;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getSenha()
    {
        return senha;
    }
    
    public Cidade getCidade()
    {
        return cidade;
    }
    
    public void setCodigo(int novoCodigo)
    {
        codigo = novoCodigo;
    }
    
    public void setDescricao(String novoNome)
    {
        nome = novoNome;
    }
    
    public void setDataNasc(String novaDataNasc)
    {
        dataNasc = novaDataNasc;
    }
    
    public void setEmail(String novoEmail)
    {
        email = novoEmail;
    }
    
    public void setSenha(String novaSenha)
    {
        senha = novaSenha;
    }
    
    public void setCidade(Cidade cidade)
    {
        this.cidade = cidade;
    }
    
    public void atualizaSenha(){
        Scanner leia = new Scanner(System.in);

        String senhaAtual;
        String novaSenha;
        String repeteSenha;

        System.out.println("Vamos atualizar sua senha!");
        System.out.println("Digite a senha: ");
        senhaAtual = leia.nextLine();

        if(senhaAtual.equals(getSenha())){
            System.out.println("Digite a nova senha :  ");
            novaSenha = leia.nextLine();
            System.out.println("\nConfirme a nova senha: ");
            repeteSenha = leia.nextLine();
            if(!novaSenha.equals(repeteSenha)){
                System.out.println("As senhas não conferem. Tente novamente.");
                atualizaSenha();
            } else {
                System.out.println("Senha alterada com sucesso.");
                senha = novaSenha;
            }

        } else {
            System.out.println("A senha atual está incorreta. Tente novamente.");
            atualizaSenha();
        }
    }
    
    public void exibeDados()
    {
        System.out.println("Dados atuais do Estudante");
        System.out.printf("Codigo: %d%n", codigo);
        System.out.printf("Nome: %S%n", nome);
        System.out.printf("Data de Nacimento: %S%n", dataNasc);
        System.out.printf("E-mail: %s%n", email);
        System.out.printf("senha: %s%n", senha);
        System.out.printf("Cidade: %s%n", cidade.getDescricao());
    }
}
