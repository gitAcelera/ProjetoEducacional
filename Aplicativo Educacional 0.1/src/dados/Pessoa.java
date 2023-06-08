package Dados;
import Banco.PessoaBD;
        
/**
 * Inicia a classe Pessoa
 * Essa classe faz o encapsulamento e referencia a outra classe
 * @see PessoaBD#PessoaBD()  
 * @author Izabelle
 */
public class Pessoa
{
    private String nome;
    private String ra;
    private String idade;
    private String cpf;
    private String senha;
    
    
    /**
     * Método construtor que inicia os atributos da classe Pessoa
     */
    public Pessoa() 
    {
        this.nome=null;
        this.ra=null;
        this.idade=null;
        this.cpf=null;   
        this.senha=null;
    }
   /**
     * Método construtor que recebe parâmetros da classe Pessoa
     * @param nome Variável utilizada no cadastro, tanto do professor, quanto do aluno
     * @param ra Variável  de identificação do aluno 
     * @param idade Variável  referente a idade do aluno 
     * @param cpf Variável de identificação do professor
     * @param senha Variável utilizada no cadastro/login, tanto do professor, quanto do aluno (segurança)
     */
    public Pessoa(String nome, String ra, String idade, String cpf, String senha)
    {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.cpf = cpf;
        this.senha = senha;
    }
    /**
     * Método get que obtém o valor da variavel nome
     * @return nome
     */

    public String getNome()
    {
        return nome;
    }
    
   /**
     * Método set que atribui um novo valor para a variavel nome
     * @param nome A variavel nome recebe um novo valor
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    /**
     * Método get que obtém o valor da variavel ra
     * @return ra
     */
    public String getRa()
    {
        return ra;
    }
    /**
     * Método set que atribui um novo valor para a variavel ra
     * @param ra A variavel ra recebe um novo valor
     */
    
    public void setRa(String ra)
    {
        this.ra = ra;
    }
    
    /**
     * Método get que obtém o valor da variavel idade
     * @return idade
     */
    public String getIdade()
    {
        return idade;
    }
   /**
     * Método set que atribui um novo valor para a variavel idade
     * @param idade A variavel idade recebe um novo valor
     */
    public void setIdade(String idade)
    {
        this.idade = idade;
    } 
    
    /**
     * Método get que obtém um novo valor da variavel cpf
     * @return cpf
     */
    public String getCpf()
    {
        return cpf;
    }
    /**
     * Método set que atribui um novo valor para a variavel cpf
     * @param cpf A variavel cpf recebe um novo valor
     */

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    } 
    /**
     * Método get que obtém o valor da variavel senha
     * @return senha
     */
    public String getSenha()
    {
        return senha;
    }
    /**
     * Método set que atribui um novo valor para a variavel senha
     * @param senha A variavel senha recebe um novo valor
     */
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
}