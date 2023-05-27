
package dados;

public class LoginProfessor
{
 private String cpf;
    private String senha;
   
    public LoginProfessor() 
    {
        this.cpf=null;
        this.senha=null;
          
    }

    public LoginProfessor(String cpf, String senha)
    {
        this.cpf = cpf;
        this.senha = senha;
         
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getSenha()
    {
        return senha;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }   
}
