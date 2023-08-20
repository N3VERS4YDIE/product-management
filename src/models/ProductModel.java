package models;

import entities.Product;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Santiago Palacio Vásquez
 */
public class ProductModel {

  public void add(Product product) throws ClassNotFoundException, SQLException {
    final String QUERY = String.format(
      "INSERT INTO products VALUES (NULL, '%s', %s, '%s', '%s');",
      product.name,
      product.price,
      product.distributor,
      product.category
    );
    DB.executeQuery(QUERY);
  }

  public void update(Product product) throws ClassNotFoundException, SQLException {
    final String QUERY = String.format(
      "UPDATE products SET name = '%s', price = %s, distributor = '%s', category = '%s' WHERE id = %s;",
      product.name,
      product.price,
      product.distributor,
      product.category,
      product.id
    );
    DB.executeQuery(QUERY);
  }

  public void delete(Byte id) throws ClassNotFoundException, SQLException {
    final String QUERY = String.format("DELETE FROM products WHERE id = '%s';", id);
    DB.executeQuery(QUERY);
  }

  public Product find(Byte id) throws ClassNotFoundException, SQLException, NoSuchElementException {
    final String QUERY = String.format("SELECT * FROM products WHERE id = '%s';", id);
    ArrayList<Object[]> rows = DB.executeQuery(QUERY);
    if (rows.isEmpty()) {
      throw new NoSuchElementException();
    }
    return toProduct(rows.get(0));
  }

  public ArrayList<Product> filter(String filter) throws ClassNotFoundException, SQLException {
    final String QUERY = String.format("SELECT * FROM products WHERE category LIKE '%%%s%%';", filter);
    ArrayList<Object[]> rows = DB.executeQuery(QUERY);
    ArrayList<Product> products = new ArrayList<>();
    for (Object[] row : rows) {
      products.add(toProduct(row));
    }
    return products;
  }

  public ArrayList<Product> all() throws ClassNotFoundException, SQLException {
    final String QUERY = "SELECT * FROM products;";
    ArrayList<Object[]> rows = DB.executeQuery(QUERY);
    ArrayList<Product> products = new ArrayList<>();
    for (Object[] row : rows) {
      products.add(toProduct(row));
    }
    return products;
  }

  public Product toProduct(Object[] row) {
    return new Product((byte) (int) row[0], (String) row[1], (BigDecimal) row[2], (String) row[3], (String) row[4]);
  }
}
