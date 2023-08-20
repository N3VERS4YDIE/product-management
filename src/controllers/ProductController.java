package controllers;

import entities.Product;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import models.ProductModel;
import views.ProductView;

/**
 *
 * @author Santiago Palacio Vásquez
 */
public class ProductController {

  private enum Icon {
    FILTER("../resources/filter.png"),
    CLEAR_FILTER("../resources/clear_filter.png");

    private ImageIcon icon;

    Icon(String path) {
      this.icon = new ImageIcon(getClass().getResource(path));
    }
  }

  private final ProductView view;

  private final ProductModel productModel = new ProductModel();
  private final List<JTextField> txtFields = new ArrayList<>();

  public ProductController(ProductView view) {
    this.view = view;

    txtFields.add(view.txtId);
    txtFields.add(view.txtName);
    txtFields.add(view.txtPrice);
    txtFields.add(view.txtDistributor);
    txtFields.add(view.txtCategory);

    initTable();
    initListeners();
  }

  private void initTable() {
    DefaultTableModel tableModel = new DefaultTableModel(
      new Object[] { "Code (SKU)", "Name", "Price", "Distributor", "Category" },
      0
    ) {
      Class<?>[] types = new Class[] { Byte.class, String.class, BigDecimal.class, String.class, String.class };

      @Override
      public Class<?> getColumnClass(int columnIndex) {
        return types[columnIndex];
      }
    };

    view.tblProducts.setModel(tableModel);
    updateTable();
  }

  private void initListeners() {
    view.tblProducts.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
          updateInputFields();
        }
      }
    );
    view.btnAdd.addActionListener(this::addProduct);
    view.btnUpdate.addActionListener(this::updateProduct);
    view.btnDelete.addActionListener(this::deleteProduct);
    view.btnSearch.addActionListener(this::searchProduct);
    view.btnClearFields.addActionListener(this::clearInputFields);
    view.tglFilter.addChangeListener(this::toggleFilter);
    view.txtFilter.addKeyListener(
      new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent evt) {
          updateFilterState();
        }
      }
    );
  }

  private void updateInputFields() {
    final int ROW = view.tblProducts.getSelectedRow();
    for (int i = 0; i < txtFields.size(); i++) {
      txtFields.get(i).setText(view.tblProducts.getValueAt(ROW, i).toString());
    }
  }

  private void addProduct(ActionEvent evt) {
    try {
      validateNonEmptyFields();

      productModel.add(createProductWithoutId());
      updateTable();
      clearInputFields(null);
    } catch (Exception e) {
      displayErrorMessage("An error occurred while adding the product.", e.getMessage());
    }
  }

  private void updateProduct(ActionEvent evt) {
    try {
      validateNonEmptyFields();

      productModel.update(createProduct());
      updateTable();
      clearInputFields(null);
    } catch (Exception e) {
      displayErrorMessage("An error occurred while updating the product.", e.getMessage());
    }
  }

  private void deleteProduct(ActionEvent evt) {
    try {
      productModel.delete(view.getIdAsByte());
      updateTable();
      clearInputFields(null);
    } catch (Exception e) {
      displayErrorMessage("An error occurred while deleting the product.", e.getMessage());
    }
  }

  private void searchProduct(ActionEvent evt) {
    try {
      final Product product = productModel.find(view.getIdAsByte());
      final Object[] row = product.toArray();
      for (int i = 0; i < txtFields.size(); i++) {
        txtFields.get(i).setText(row[i].toString());
      }
    } catch (NoSuchElementException e) {
      String auxIdText = view.getId();
      clearInputFields(null);
      view.txtId.setText(auxIdText);
      displayErrorMessage("Product not found", null);
    } catch (Exception e) {
      displayErrorMessage("An error occurred while searching the product.", e.getMessage());
    }
  }

  private void clearInputFields(ActionEvent evt) {
    for (JTextField field : txtFields) {
      field.setText("");
    }
  }

  private void toggleFilter(ChangeEvent evt) {
    if (view.tglFilter.isSelected()) {
      try {
        productModel.filter(view.getFilter());
        updateTable();
      } catch (Exception e) {
        displayErrorMessage("An error occurred while filtering the table.", e.getMessage());
      }
      view.tglFilter.setIcon(Icon.CLEAR_FILTER.icon);
    } else {
      updateTable();
      view.tglFilter.setIcon(Icon.FILTER.icon);
    }
  }

  private void updateFilterState() {
    view.tglFilter.setEnabled(!view.getFilter().isEmpty());
    view.tglFilter.setSelected(false);
  }

  private void updateTable() {
    DefaultTableModel tableModel = (DefaultTableModel) view.tblProducts.getModel();
    tableModel.setRowCount(0);
    try {
      if (view.tglFilter.isSelected()) {
        updateTable(productModel.filter(view.getFilter()));
      } else {
        updateTable(productModel.all());
      }
    } catch (Exception e) {
      displayErrorMessage("An error occurred while updating the table.", e.getMessage());
    }
  }

  private void updateTable(ArrayList<Product> products) {
    DefaultTableModel tableModel = (DefaultTableModel) view.tblProducts.getModel();
    tableModel.setRowCount(0);
    products.forEach(product -> tableModel.addRow(product.toArray()));
  }

  private Product createProductWithoutId() {
    return new Product(
      view.txtName.getText().trim(),
      view.getPriceAsBigDecimal(),
      view.getDistributor(),
      view.getCategory()
    );
  }

  private Product createProduct() {
    return new Product(
      view.getIdAsByte(),
      view.txtName.getText().trim(),
      view.getPriceAsBigDecimal(),
      view.getDistributor(),
      view.getCategory()
    );
  }

  private void validateNonEmptyFields() {
    for (JTextField field : txtFields) {
      if (field.getText().isEmpty()) {
        throw new IllegalArgumentException("Empty fields are not allowed");
      }
    }
  }

  private void displayErrorMessage(String msg, String errorMsg) {
    if (errorMsg != null) {
      msg += "\n\n" + errorMsg;
    }
    JOptionPane.showMessageDialog(view, msg, "Error", JOptionPane.ERROR_MESSAGE);
  }
}
