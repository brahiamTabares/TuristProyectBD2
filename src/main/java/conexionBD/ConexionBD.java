package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private Connection connection;
    private final String url = "jdbc:oracle:thin:@localhost:1521:tuSID"; // Reemplaza con tu URL de conexión
    private final String username = "tuUsuario";
    private final String password = "tuContraseña";

    public ConexionBD() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void cerrarConexion() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
