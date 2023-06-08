
package dados;
/**
 * Inicia classe LoginProfessor
 * @author Pedro
 */
public class LoginProfessor
{
 private String cpf;
    private String senha;
    
   /**
 * Método construtor que inicia os atributos do Professor
 */
    public LoginProfessor() 
    {
        this.cpf=null;
        this.senha=null;
          
    }
/**
 * Método construtor que recebe parâmetros do Professor
 * @param cpf Variável de identificação do professor
 * @param senha Variável refetente a segurança do professor
 */
    public LoginProfessor(String cpf, String senha)
    {
        this.cpf = cpf;
        this.senha = senha;
         
    }
    /**
     * Método get que obtém o valor da variável cpf
     * @return cpf
     */

    public String getCpf()
    {
        return cpf;
    }
/**
     * Método set que atribui um novo valor para a variável cpf
     * @param cpf Recebe/atualiza um  valor
     */
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
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
     * @param senha Recebe/atualiza um valor
     */
    public void setSenha(String senha)
    {
        this.senha = senha;
    }   
}
