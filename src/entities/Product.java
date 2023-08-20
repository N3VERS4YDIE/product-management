package entities;

import java.math.BigDecimal;

/**
 *
 * @author Santiago Palacio Vásquez
 */
public class Product {

  public Byte id;
  public String name;
  public BigDecimal price;
  public String distributor;
  public String category;

  public Product(Byte id, String name, BigDecimal price, String distributor, String category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.distributor = distributor;
    this.category = category;
  }

  public Product(String name, BigDecimal price, String distributor, String category) {
    this.name = name;
    this.price = price;
    this.distributor = distributor;
    this.category = category;
  }

  public Object[] toArray() {
    return new Object[] { id, name, price, distributor, category };
  }
}
