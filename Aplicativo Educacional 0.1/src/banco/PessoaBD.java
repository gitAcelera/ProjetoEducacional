package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Pessoa;

public class PessoaBD
{

    Connection connection = null;

    public boolean inserirPessoa(Pessoa pessoa) 
    {
        System.out.println("Inserir Pessoa");
       
        connection = Conexao.getInstance().getConnection();
        
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO aluno(nome,idade,ra,senha) "
            		   + "VALUES ('"+ pessoa.getNome() + "','" + pessoa.getRa() + "', '" 
            		   + pessoa.getIdade() + "', '" + pessoa.getCpf() + "', '" + pessoa.getSenha() + "')";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
           
            return true;
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        } 
        finally 
        {
            try 
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } 

    
    public boolean atualizarPessoa(Pessoa pessoa, String nomeAlterar) 
    {
        System.out.println("Atualizar Pessoa");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            //String sql = "UPDATE pessoa SET nome = '" + pessoa.getNome() + "' WHERE codaluno = " + pessoa.getCodigo() + ";";
            
            String sql = "UPDATE aluno SET nome="+ "'"+pessoa.getNome()+"'," +
                         "ra='"+pessoa.getRa()+"', idade='"+pessoa.getIdade()+"'," +
                         "cpf='"+pessoa.getCpf()+"', senha='"+pessoa.getSenha()+" WHERE nome='"+nomeAlterar+"';";
                    
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            return true;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
    
    
    public String relatorioPessoas()
    {
    	String dados = "";
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM aluno");
            
            while (res.next())
            {
            	dados += "\n"+res.getString("nome");
				dados += "\n"+res.getString("idade");
				dados += "\n"+res.getString("ra");
				dados += "\n"+res.getString("");
				dados += "\n-----------------------------------------";				
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
          
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    	
    	return dados;
    }
    

    public ArrayList<Pessoa> getListaPessoas() 
    {
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM aluno");
            
            while (res.next())
            {
                Pessoa pessoa = new Pessoa(res.getString("nome"), res.getString("ra"), 
                		                   res.getString("idade"), res.getString("cpf"), res.getString("senha"));
                listaPessoas.add(pessoa);
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
          
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return listaPessoas;
    } 
    
    public boolean excluirAluno(Pessoa pessoa) 
    {
    	boolean status = true;
    	
        System.out.println("Excluir Pessoa");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para excluir");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();
            
            String sql = "DELETE FROM aluno WHERE nome='"+pessoa.getNome()+"'";
            
            System.out.println("SQL: " + sql);
            
            if(stmt.executeUpdate(sql)!=0)
            {
            	status = true;	
            }
            else
            {
            	status = false;
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally 
        {
            
            try
            {
                stmt.close();
                connection.close();
            } 
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return status;
    }



public boolean excluirProfessor(Pessoa pessoa) 
    {
    	boolean status = true;
    	
        System.out.println("Excluir Pessoa");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para excluir");
        Statement stmt = null;
        
        try 
        {
            stmt = connection.createStatement();
            
            String sql = "DELETE FROM professor WHERE nome='"+pessoa.getNome()+"'";
            
            System.out.println("SQL: " + sql);
            
            if(stmt.executeUpdate(sql)!=0)
            {
            	status = true;	
            }
            else
            {
            	status = false;
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally 
        {
            
            try
            {
                stmt.close();
                connection.close();
            } 
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return status;
    }
}