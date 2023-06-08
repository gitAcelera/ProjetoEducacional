
package Banco;
import telas.loginProfessor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dados.LoginProfessor;


/**
 * Classe que permite o acesso do professor ao apicativo
 * @deprecated  A classe para o método de verificar login do professor é outra agora
 * @see loginProfessor#verificaLoginProfessor() 
 * @author Mateus
 */
public class AcessoBDProfessor 
{
   Connection connection = null;
   /**
    * Verificar o login do professor no banco de dados
    * @deprecated Pelo fato de só aceitar o último cadastro, houve uma mudança de método para o login do professor
    * @see verificaLoginProfessor
    * @param loginProfessor O objeto loginProfessor contém as informações de login do professor
    * @return status 
    */

    public boolean verificaAcessoProfessor(LoginProfessor loginProfessor)
    {
    	/**
         * Método que verifica o acesso
         * @param loginProfessor Possui as informações de login do professor
         */ 
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM professor");
            
            while(res.next())
			{
			   if(loginProfessor.getCpf().compareTo(res.getString("cpf"))==0 && loginProfessor.getSenha().compareTo(res.getString("senha"))==0)
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
            status = false;// Não foi possível efeituar o login
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
