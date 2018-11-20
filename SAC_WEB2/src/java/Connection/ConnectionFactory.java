package Connection;

import java.sql.*;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/web2";
    private static final String DRIVER_CLASS_MYSQL = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection getConnection() {
        System.out.println("Conectando ao Banco de Dados");
        try {
            Class.forName(DRIVER_CLASS_MYSQL);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (conn!= null) {
                conn.close();
            }

            if (stmt!= null) {
                stmt.close();
            }

            if (rs!= null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}