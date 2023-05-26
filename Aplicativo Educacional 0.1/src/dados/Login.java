package Dados;

public class Login
{
    private String ra;
    private String senha;
   

    public Login() 
    {
        this.ra=null;
        this.senha=null;
          
    }

    public Login(String ra, String senha)
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