/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author lucas
 */
public class ConnectionFactory {
    
    private static final String currentD = System.getProperty("user.dir");
    private static final String DRIVER   = "com.mysql.cj.jdbc.Driver";
    private static final String url      = "jdbc:mysql://localhost/bdescoladefutebol";
    private static final String user     = "root";
    private static final String password = "abcd1234";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
        
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        if (con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro no closeConnection: " + ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro no closeConnection: " + ex);
            }
        }
        closeConnection(con);
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro no closeConnection: " + ex);
            }
        }
        closeConnection(con,stmt);
    }
}
