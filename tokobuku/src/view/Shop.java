package view;

import model.pelanggantetap;
import model.bukanpelanggantetap;
import model.Receipt;
import model.alattulis;

/**
 *
 * @author adivira123
 */
public class Shop extends javax.swing.JFrame {
    
    pelanggantetap mCust;
    bukanpelanggantetap nmCust;
    Receipt receipt;
    
    public Shop(pelanggantetap Cust) {
        this.mCust = Cust;
        initComponents();
        UserLabel.setText("Hello " + mCust.getName());
        receipt = new Receipt(mCust);
    }
    
    public Shop(bukanpelanggantetap Cust) {
        this.nmCust = Cust;
        initComponents();
        UserLabel.setText("Hello " + nmCust.getName());
        receipt = new Receipt(nmCust);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        totalItemLabel = new javax.swing.JLabel();
        totalGSTLabel = new javax.swing.JLabel();
        totalCostItemLabel = new javax.swing.JLabel();
        totalTaxLabel = new javax.swing.JLabel();
        labelTotalAmount = new javax.swing.JLabel();
        labelSubTotal = new javax.swing.JLabel();
        subTotalLabel = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        calcButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        labelTotalDiscount = new javax.swing.JLabel();
        totalDiscountLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        itemNameLabel = new javax.swing.JLabel();
        itemPriceLabel = new javax.swing.JLabel();
        penQuantityText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        penLabel = new javax.swing.JLabel();
        penPriceLabel = new javax.swing.JLabel();
        pencilLabel = new javax.swing.JLabel();
        eraserLabel = new javax.swing.JLabel();
        penPriceLabel1 = new javax.swing.JLabel();
        penPriceLabel2 = new javax.swing.JLabel();
        pencilQuantityText = new javax.swing.JTextField();
        eraserQuantityText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(840, 531));
        setMinimumSize(new java.awt.Dimension(840, 531));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(860, 536));
        jPanel2.setPreferredSize(new java.awt.Dimension(860, 536));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(37, 116, 77));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        totalItemLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalItemLabel.setText("Total harga barang");

        totalGSTLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalGSTLabel.setText("Total GST");

        totalCostItemLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalCostItemLabel.setText(" ");

        totalTaxLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        labelTotalAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTotalAmount.setText("jumlah Total ");

        labelSubTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelSubTotal.setText("Sub Total");

        subTotalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        totalAmountLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        calcButton.setText("Calculate");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        labelTotalDiscount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTotalDiscount.setText("Total Discount");

        totalDiscountLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalItemLabel)
                            .addComponent(totalGSTLabel)
                            .addComponent(labelSubTotal)
                            .addComponent(labelTotalAmount)
                            .addComponent(labelTotalDiscount))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalTaxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalDiscountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalCostItemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(calcButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton)
                        .addGap(94, 94, 94))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalCostItemLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalItemLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalGSTLabel)
                    .addComponent(totalTaxLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalDiscount)
                    .addComponent(totalDiscountLabel))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subTotalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalAmountLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSubTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jPanel5.setBackground(new java.awt.Color(83, 198, 140));

        itemNameLabel.setText("ItemName");

        itemPriceLabel.setText("Price");

        penQuantityText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        penQuantityText.setText("0");
        penQuantityText.setToolTipText("");
        penQuantityText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        penQuantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penQuantityTextActionPerformed(evt);
            }
        });
        penQuantityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel1.setText("Quantity");

        penLabel.setText("Pen");

        penPriceLabel.setText("2000");

        pencilLabel.setText("Pencil");

        eraserLabel.setText("Eraser");

        penPriceLabel1.setText("1500");

        penPriceLabel2.setText("500");

        pencilQuantityText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pencilQuantityText.setText("0");
        pencilQuantityText.setToolTipText("");
        pencilQuantityText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pencilQuantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencilQuantityTextActionPerformed(evt);
            }
        });
        pencilQuantityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        eraserQuantityText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eraserQuantityText.setText("0");
        eraserQuantityText.setToolTipText("");
        eraserQuantityText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eraserQuantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraserQuantityTextActionPerformed(evt);
            }
        });
        eraserQuantityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(itemNameLabel)
                        .addGap(78, 78, 78)
                        .addComponent(itemPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penLabel)
                            .addComponent(pencilLabel)
                            .addComponent(eraserLabel))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penPriceLabel2)
                            .addComponent(penPriceLabel1)
                            .addComponent(penPriceLabel))))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(penQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pencilQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eraserQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameLabel)
                    .addComponent(itemPriceLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penLabel)
                    .addComponent(penPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pencilLabel)
                    .addComponent(penPriceLabel1)
                    .addComponent(pencilQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eraserLabel)
                    .addComponent(penPriceLabel2)
                    .addComponent(eraserQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jButton1.setText("Print Receipt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 840, 390));

        jLabel2.setFont(new java.awt.Font("Heiti TC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ITEMS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Heiti TC", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ALL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        UserLabel.setFont(new java.awt.Font("Heiti TC", 1, 24)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setText("hallo manizz!!");
        jPanel2.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void penQuantityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penQuantityTextActionPerformed
        System.out.print(penQuantityText.getText());
    }//GEN-LAST:event_penQuantityTextActionPerformed

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        
        try {
            alattulis pen = new alattulis("pen", Integer.parseInt(penQuantityText.getText()));
            alattulis pencil = new alattulis("pencil", Integer.parseInt(pencilQuantityText.getText()));
            alattulis eraser = new alattulis("eraser", Integer.parseInt(eraserQuantityText.getText()));

            receipt.clearItems();
            receipt.addItems(pen);
            receipt.addItems(pencil);
            receipt.addItems(eraser);
        
            totalCostItemLabel.setText("idr " + String.format("%.2f", pen.getTotalPrice()));
            totalTaxLabel.setText("idr " + String.format("%.2f", receipt.calculateGST()));
            totalDiscountLabel.setText("idr " + String.format("%.2f", receipt.calculateDiscount()));
            subTotalLabel.setText("idr " + String.format("%.2f", receipt.calculateSubTotal()));
            totalAmountLabel.setText("idr " + String.format("%.2f", receipt.calculateTotal()));
        } catch (Exception e) {
            System.out.print(e);
        }
        
    }//GEN-LAST:event_calcButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        
        receipt.clearItems();
        totalCostItemLabel.setText("idr 0");
        totalTaxLabel.setText("idr 0");
        totalDiscountLabel.setText("idr 0");
        subTotalLabel.setText("idr 0");
        totalAmountLabel.setText("idr 0");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new showReceipt(receipt).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pencilQuantityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencilQuantityTextActionPerformed
       
    }//GEN-LAST:event_pencilQuantityTextActionPerformed

    private void eraserQuantityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraserQuantityTextActionPerformed
     
    }//GEN-LAST:event_eraserQuantityTextActionPerformed

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton calcButton;
    private javax.swing.JLabel eraserLabel;
    private javax.swing.JTextField eraserQuantityText;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JLabel itemPriceLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelSubTotal;
    private javax.swing.JLabel labelTotalAmount;
    private javax.swing.JLabel labelTotalDiscount;
    private javax.swing.JLabel penLabel;
    private javax.swing.JLabel penPriceLabel;
    private javax.swing.JLabel penPriceLabel1;
    private javax.swing.JLabel penPriceLabel2;
    private javax.swing.JTextField penQuantityText;
    private javax.swing.JLabel pencilLabel;
    private javax.swing.JTextField pencilQuantityText;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel subTotalLabel;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JLabel totalCostItemLabel;
    private javax.swing.JLabel totalDiscountLabel;
    private javax.swing.JLabel totalGSTLabel;
    private javax.swing.JLabel totalItemLabel;
    private javax.swing.JLabel totalTaxLabel;
    // End of variables declaration//GEN-END:variables
}
