package Dados;

public class LoginAluno
{
    private String ra;
    private String senha;
   

    public LoginAluno() 
    {
        this.ra=null;
        this.senha=null;
          
    }

    public LoginAluno(String ra, String senha)
    {
        this.ra = ra;
        this.senha = senha;
         
    }

    public String getRa()
    {
        return ra;
    }

    public void setRa(String ra)
    {
        this.ra = ra;
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