package Dados;

public class Pessoa
{
    private String nome;
    private String ra;
    private String idade;
    private String cpf;
    private String senha;
    
    

    public Pessoa() 
    {
        this.nome=null;
        this.ra=null;
        this.idade=null;
        this.cpf=null;   
        this.senha=null;
    }

    public Pessoa(String nome, String ra, String idade, String cpf, String senha)
    {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getRa()
    {
        return ra;
    }
    
    public void setRa(String ra)
    {
        this.ra = ra;
    }
    
    public String getIdade()
    {
        return idade;
    }

    public void setIdade(String idade)
    {
        this.idade = idade;
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