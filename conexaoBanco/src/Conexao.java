import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class Conexao {
    //variaveis constantes
    private static final String URL = "jdbc:mysql://localhost:3306/forms";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public static Connection conectar(){
        try{
        return DriverManager.getConnection(URL,USUARIO,SENHA);//ele tenta conectar ao banco de dados
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao consultar o banco" + e.getMessage());
        }
    }

}
