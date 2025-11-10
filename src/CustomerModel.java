import java.sql.Connection;
import java.sql.SQLException;

public class CustomerModel {

    private Connection connection;

    public CustomerModel() {
        try {
            this.connection = DatabaseConnection.getConnection();
            System.out.println("Connection Successful! (Prolly)");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
