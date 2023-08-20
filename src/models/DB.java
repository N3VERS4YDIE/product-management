package models;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.client.result.ResultSetMetaData;

/**
 *
 * @author Santiago Palacio Vásquez
 */
class DB {

  private DB() {}

  // Database info
  public static final String TABLE_NAME = "products";
  private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
  private static final String DB_URL = "jdbc:mariadb://localhost:3306/product_management";

  // Database credentials
  private static final String USER = "root";
  private static final String PSWD = "";

  static Connection getConnection() throws ClassNotFoundException, SQLException {
    Connection connection;
    Class.forName(JDBC_DRIVER);
    connection = (Connection) DriverManager.getConnection(DB_URL, USER, PSWD);
    return connection;
  }

  static ArrayList<Object[]> executeQuery(String query) throws ClassNotFoundException, SQLException {
    final ArrayList<Object[]> rowSet = new ArrayList<>();
    final ResultSet rs = getConnection().prepareStatement(query).executeQuery();
    final ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
    final int COLUMNS = rsmd.getColumnCount();

    while (rs.next()) {
      final Object[] row = new Object[COLUMNS];
      for (int i = 0; i < COLUMNS; ++i) {
        row[i] = rs.getObject(i + 1);
      }
      rowSet.add(row);
    }

    return rowSet;
  }
}
