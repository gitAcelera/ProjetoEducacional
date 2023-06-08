package Banco;
import telas.loginAluno;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Dados.LoginAluno;

/**
 * Classe que permite o acesso do aluno ao apicativo
 *  @deprecated  A classe para o método de verificar login do aluno é outra agora
 * @see loginAluno#verificaLoginAluno()
 * @author Mateus
 */

public class AcessoBDaluno
{
/**
     * Verifica o login do aluno no banco de dados
     * @param login O objeto login contém as informações de login do aluno
     * @return status 
     */
    Connection connection = null;

    /**
     * Método para verificar login do aluno
     * @deprecated Pelo fato de só aceitar o último cadastro, houve uma mudança de método para o login do aluno
     * @see verificaLoginAluno
     * @param login O objeto login contém as informações de login do aluno
     * @return  status
     */
    
    public boolean verificaAcesso(LoginAluno login)
    {
    	 /**
         * Método que verifica o acesso
         * @param login Possui as informações de login do aluno
         */
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM aluno");
            
            while(res.next())
			{
			   if(login.getRa().compareTo(res.getString("ra"))==0 && login.getSenha().compareTo(res.getString("senha"))==0)
			   {
				   status = true;
				   
			   }
			   else
			   {
				   status = false;
			   }
			   
			}
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false; //Não foi possível realizar o login
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