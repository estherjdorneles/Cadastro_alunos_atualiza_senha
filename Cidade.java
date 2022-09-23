import java.util.Scanner;

/**
 * Projeto para a cadeira de Laboratório 1 da faculdade. 
 * O objetivo é criar um app de cadastro de alunos para
 * uma startup ficticia chamada Fun4Study
 * 
 * @author Esther J. Dorneles 
 * @version 20/09/22
 */
public class Cidade
{
    // atributos
    private int codigo;
    private String descricao;
    private String uf;
    private int qtdEstudante;

    /**
     * Construtor 
     */
    public Cidade(int codigo, String descricao, String uf)
    {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
    }
    
    // métodos

    public int getCodigo()
    {
        return codigo;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public String getUf()
    {
        return uf;
    }
    
    public void setDescricao(String novaDescricao)
    {
        descricao = novaDescricao;
    }
    
    public void setUf(String novaUf)
    {
        uf = novaUf;
    }
    
    public void addNovoAluno()
    {
        qtdEstudante = qtdEstudante + 1;
    }
    
    public void exibeDados()
    {
        System.out.println("Dados atuais");
        System.out.printf("Codigo: %d%n", codigo);
        System.out.println("Descricao: " +  descricao);
        System.out.printf("UF: %S%n", uf);
        System.out.println("Quantidade de estudantes: " + qtdEstudante);
    }
}
