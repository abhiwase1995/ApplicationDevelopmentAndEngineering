/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.ProductDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abhilash Wase
 */
public class ProductManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductManagementPanel
     * 
     */
    private ProductDirectory productDirectory;
    private JPanel jPanel;
    
    public ProductManagementJPanel(ProductDirectory productDirectory, JPanel jPanel) {
        initComponents();
        
        this.productDirectory = productDirectory;
        this.jPanel = jPanel;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateProduct = new javax.swing.JButton();
        btnManageProduct = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 450));

        btnCreateProduct.setText("Create Product");
        btnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProductActionPerformed(evt);
            }
        });

        btnManageProduct.setText("Manage Product");
        btnManageProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnCreateProduct)
                .addGap(18, 18, 18)
                .addComponent(btnManageProduct)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductActionPerformed
        // TODO add your handling code here:
        ManageProductJPanel manageProductJPanel = new ManageProductJPanel(productDirectory, this.jPanel);
        this.jPanel.add("manageProductJPanel", manageProductJPanel);
        
        CardLayout layout = (CardLayout) this.jPanel.getLayout();
        layout.next(jPanel);
    }//GEN-LAST:event_btnManageProductActionPerformed

    private void btnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProductActionPerformed
        // TODO add your handling code here:
       CreateProductJPanel createProductJPanel = new CreateProductJPanel (productDirectory, this.jPanel);
       this.jPanel.add("createProductJPanel", createProductJPanel);
       
       CardLayout layout = (CardLayout) this.jPanel.getLayout();
       layout.next(jPanel);
    }//GEN-LAST:event_btnCreateProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProduct;
    private javax.swing.JButton btnManageProduct;
    // End of variables declaration//GEN-END:variables
}
