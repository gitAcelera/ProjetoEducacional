package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Inicia classe Conexão para acesso ao banco de dados
 * @author Mateus
 */
public class Conexao 
{

    Connection con = null;
    private static Conexao instance = null;
   /**
     * Método construtor da classe "Conexão"
     */
    public Conexao() 
    {
    	try 
    	{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Carregado com sucesso!!!");
        } 
    	catch (ClassNotFoundException e) 
    	{
            System.out.println("O driver do Mysql não pode ser carregado!");
        }
    }
    
   /**
     * Método get static da classe Conexão
     * @return instância
     */
    public static Conexao getInstance() 
    {
        if (instance == null) 
        {
            instance = new Conexao();
        }
        return instance;
    }
     /**
     * Metódo get que inicia a conexão no banco de dados
     * @return connection
     */
    public Connection getConnection() 
    {
        try 
        {
            if ((con == null) || (con.isClosed())) 
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost/aplicativo_educacional", "root", "");
                System.out.println("Conexão estabelecida");
            }
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return con;
    }
    /**
     * Método que retorna pro void
     */
    public void destroy() 
    {
        try 
        {
            con.close();
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    
}