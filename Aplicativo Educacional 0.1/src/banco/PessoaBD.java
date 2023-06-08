package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Dados.Pessoa;
/**
 * Inicia classe PessoaBD
 * @author Izabelle
 */
public class PessoaBD
{
    /**
     * Método que atribui valores gerais para a classe pessoa, englobando atributos do aluno e do professor
     * @param pessoa Há a utilização do encapsulamento realizado na Classe Pessoa. Enviando os valores ao banco. 
     * @see Pessoa#Pessoa()  
     * @return true (CREATE)
     */

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
            return false;//não foi possível a realização do Create
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

    /**
     * Método que permite alterar dados
     * @param pessoa Recebe os valores  das variáveis da qual o usuário deseja mudar 
     * @param nomeAlterar Parametro utilizado para que o comando UPDATE no MYSQL seja possível
     * @return true (UPDATE)
     */
    public boolean atualizarPessoa(Pessoa pessoa, String nomeAlterar) 
    {
        System.out.println("Atualizar Pessoa");
        
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();
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
            return false; //não foi possível a realização do UPDATE
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
    
    /**
     * Método que exibe classificação das pontuações dos alunos
     * @return classificacao (READ)
     */    
    public String relatorioPessoas()
    {
    	String classificacao = "";
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
 ResultSet res = stmt.executeQuery("SELECT aluno.nome,aluno.ra,jogos.total FROM aluno JOIN jogos ON aluno.idAluno=jogos.IdAluno");            
            while (res.next())
            {
            	classificacao+= "\n"+res.getString("nome");
				classificacao += "\n"+res.getString("ra");
				classificacao += "\n"+res.getString("total");
				classificacao += "\n-----------------------------------------";				
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;//não foi possível a realização do READ
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
    	
    	return classificacao;
    }
    
   /**
     * Método para listar os alunos
     * @deprecated Uma alternativa para o metodo de classificação dos alunos que foi descartada
     * @return listaPessoas
     */
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
    
    /**
     * Método que permite deletar dados
     * @param pessoa Recebe um valor válido(já cadastrado) de ra. Parametro necessário para que haja o êxito do comando deletar no MYSQL
     * @return status (delete)
     */
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
            
            String sql = "DELETE FROM aluno WHERE ra='"+pessoa.getRa()+"'";
            
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
            status = false;//não foi possível a realização do DELETE
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


/**
 * Método que permite deletar dados
 * @param pessoa Recebe um valor válido(já cadastrado) de CPF. Parametro necessário para que haja o êxito do comando deletar no MYSQL
 * @return stataus (delete)
 */
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
            
            String sql = "DELETE FROM professor WHERE cpf='"+pessoa.getCpf()+"'";
            
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
            status = false; //não foi possível a realização do Delete
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
/**
 * Método que permite iniciar jogo personalizado
 * @return jogo (busca do jogo personalizado)
 */
public String buscarJogo()
    {
    	String jogo = "";
    	
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM questoes");
            
            while (res.next())
            {
            	jogo+= "\n Código : "+res.getString("codigo" );
			jogo += "\n Disciplina : "+res.getString("disciplina");
				jogo += "\n Questão : "+res.getString("questao");
				jogo += "\n----------------------------------------------";				
            }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;//não foi possível a realização do jogo personalizado
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
    	
    	return jogo;
    }


}