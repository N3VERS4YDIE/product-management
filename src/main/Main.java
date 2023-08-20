package main;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.EventQueue;
import views.ProductView;

/**
 *
 * @author Santiago Palacio Vásquez
 */
public class Main {

  public static void main(String[] args) {
    FlatMacDarkLaf.setup();
    EventQueue.invokeLater(ProductView::new);
  }
}
