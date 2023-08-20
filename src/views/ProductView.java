package views;

import controllers.ProductController;
import java.awt.Dimension;
import java.math.BigDecimal;

/**
 *
 * @author Santiago Palacio Vásquez
 */
public class ProductView extends javax.swing.JFrame {

  /**
   * Creates new form View
   */
  public ProductView() {
    initComponents();
    setMinimumSize(new Dimension(1000, 540));
    setPreferredSize(new Dimension(1280, 640));
    setSize(getPreferredSize());
    setLocationRelativeTo(null);
    // setExtendedState(MAXIMIZED_BOTH);

    tglFilter.setEnabled(false);
    new ProductController(this);

    setVisible(true);
  }

  public String getId() {
    return txtId.getText().trim();
  }

  public Byte getIdAsByte() {
    return Byte.parseByte(txtId.getText());
  }

  public String getName() {
    return txtName.getText().trim();
  }

  public String getPrice() {
    return txtPrice.getText().trim();
  }

  public BigDecimal getPriceAsBigDecimal() {
    return new BigDecimal(txtPrice.getText());
  }

  public String getDistributor() {
    return txtDistributor.getText().trim();
  }

  public String getCategory() {
    return txtCategory.getText().trim();
  }

  public String getFilter() {
    return txtFilter.getText().trim();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jSplitPane1 = new javax.swing.JSplitPane();
    pnlProps = new javax.swing.JPanel();
    lbl1 = new javax.swing.JLabel();
    lbl2 = new javax.swing.JLabel();
    lbl3 = new javax.swing.JLabel();
    lbl4 = new javax.swing.JLabel();
    lbl5 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    lbl6 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Product Managment");

    lbl1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lbl1.setText("Code (SKU)");

    txtId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

    btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Search.png"))); // NOI18N
    btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    lbl2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lbl2.setText("Name");

    txtName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

    lbl3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lbl3.setText("Price");

    txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

    lbl4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lbl4.setText("Distributor");

    txtDistributor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

    lbl5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lbl5.setText("Category");

    txtCategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

    jPanel1.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

    btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Add.png"))); // NOI18N
    btnAdd.setText("Add");
    btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jPanel1.add(btnAdd);

    btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Update.png"))); // NOI18N
    btnUpdate.setText("Update");
    btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jPanel1.add(btnUpdate);

    btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
    btnDelete.setText("Delete");
    btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jPanel1.add(btnDelete);

    btnClearFields.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    btnClearFields.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/clear.png"))); // NOI18N
    btnClearFields.setText("Clear Fields");
    btnClearFields.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnClearFields.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jPanel1.add(btnClearFields);

    javax.swing.GroupLayout pnlPropsLayout = new javax.swing.GroupLayout(pnlProps);
    pnlProps.setLayout(pnlPropsLayout);
    pnlPropsLayout.setHorizontalGroup(
      pnlPropsLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(txtName)
        .addComponent(txtPrice)
        .addComponent(txtDistributor)
        .addComponent(txtCategory)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        .addGroup(
          pnlPropsLayout
            .createSequentialGroup()
            .addGroup(
              pnlPropsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl1)
                .addComponent(lbl2)
                .addComponent(lbl3)
                .addComponent(lbl4)
                .addComponent(lbl5)
                .addComponent(txtId)
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnSearch)
        )
    );
    pnlPropsLayout.setVerticalGroup(
      pnlPropsLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          pnlPropsLayout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(
              pnlPropsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  txtId,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(btnSearch)
            )
            .addGap(18, 18, 18)
            .addComponent(lbl2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              txtName,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, 18)
            .addComponent(lbl3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              txtPrice,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, 18)
            .addComponent(lbl4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              txtDistributor,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, 18)
            .addComponent(lbl5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              txtCategory,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, 18)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(69, Short.MAX_VALUE)
        )
    );

    jSplitPane1.setLeftComponent(pnlProps);

    tblProducts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    tblProducts.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] {}));
    tblProducts.setShowGrid(true);
    jScrollPane1.setViewportView(tblProducts);

    txtFilter.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

    lbl6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lbl6.setText("Filter");

    tglFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Filter.png"))); // NOI18N
    tglFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addComponent(lbl6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtFilter)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tglFilter)
                )
            )
        )
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          jPanel2Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tglFilter, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(
                  jPanel2Layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(
                      txtFilter,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addComponent(lbl6)
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
            .addContainerGap()
        )
    );

    jSplitPane1.setRightComponent(jPanel2);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jSplitPane1).addContainerGap())
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jSplitPane1).addContainerGap())
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  public final javax.swing.JButton btnAdd = new javax.swing.JButton();
  public final javax.swing.JButton btnClearFields = new javax.swing.JButton();
  public final javax.swing.JButton btnDelete = new javax.swing.JButton();
  public final javax.swing.JButton btnSearch = new javax.swing.JButton();
  public final javax.swing.JButton btnUpdate = new javax.swing.JButton();
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSplitPane jSplitPane1;
  private javax.swing.JLabel lbl1;
  private javax.swing.JLabel lbl2;
  private javax.swing.JLabel lbl3;
  private javax.swing.JLabel lbl4;
  private javax.swing.JLabel lbl5;
  private javax.swing.JLabel lbl6;
  private javax.swing.JPanel pnlProps;
  public final javax.swing.JTable tblProducts = new javax.swing.JTable();
  public final javax.swing.JToggleButton tglFilter = new javax.swing.JToggleButton();
  public final javax.swing.JTextField txtCategory = new javax.swing.JTextField();
  public final javax.swing.JTextField txtDistributor = new javax.swing.JTextField();
  public final javax.swing.JTextField txtFilter = new javax.swing.JTextField();
  public final javax.swing.JTextField txtId = new javax.swing.JTextField();
  public final javax.swing.JTextField txtName = new javax.swing.JTextField();
  public final javax.swing.JTextField txtPrice = new javax.swing.JTextField();
  // End of variables declaration//GEN-END:variables
}
