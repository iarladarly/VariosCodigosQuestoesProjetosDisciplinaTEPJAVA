package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class Conexao {
    private final String URL = "jdbc:mysql://localhost:3306/papelaria";
    private final String USUARIO = "root";
    private final String SENHA = "";
    private static Connection Connec;

    public Conexao() {
        try {
            Connec = DriverManager.getConnection(URL, USUARIO, SENHA);
             // JOptionPane.showMessageDialog(null, "Conectado com sucesso", "Conectado", 1);

            //Connec.setAutoCommit(false);
          
        } catch (Exception ex) {
           // JOptionPane.showMessageDialog(null, "Erro ao buscar ter conexão com o banco de dados", "Errro", 0);
           
        }
    }
    public static Connection getConnection() {
        //Chamar conexãp
        if (Connec == null) {
            new Conexao();
        }
        //Retorna a conexão
        return Connec;
    }
    
    public static void fecharConexao() {
        //Fechar a conexão
        try {
            //Se a conexão não estiver fechada
            if (!Connec.isClosed()) {
                Connec.close();
            }
        }catch (SQLException ex) {
                    Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
      //  } catch (SQLException e) {

    public static void main(String[] args) {
        //Executar a classe então chama a conexão
       // Conexao.getConnection();
    }
}


