package Dados;
/**
 * Inicia classe LoginAluno
 * @author Mateus
 */
public class LoginAluno
{
    private String ra;
    private String senha;
   
/**
 * Método construtor que inicia os atributos do Aluno
 */
    public LoginAluno() 
    {
        this.ra=null;
        this.senha=null;
          
    }
    
/**
 * Método construtor que recebe parâmetros do Aluno
 * @param ra Variável que recebe a identificação do aluno 
 * @param senha  Variável refetente a segurança do aluno
 */
    public LoginAluno(String ra, String senha)
    {
        this.ra = ra;
        this.senha = senha;
         
    }
    /**
     * Método get que obtém o valor da variável ra
     * @return ra
     */
    public String getRa()
    {
        return ra;
    }
    /**
     * Método set que atribui um novo valor para a variável ra
     * @param  ra Recebe/atualiza um  valor 
     */
    public void setRa(String ra)
    {
        this.ra = ra;
    }
 /**
     * Método get que obtém o valor da variável senha
     * @return senha
     */
    public String getSenha()
    {
        return senha;
    }
     /**
     * Método set que atribui um novo valor para a variável senha
     * @param senha Recebe/atualiza um  valor
     */
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
}