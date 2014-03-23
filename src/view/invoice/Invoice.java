/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.invoice;

/**
 *
 * @author Akash
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lab_waiterId = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lab_proId = new javax.swing.JLabel();
        txt_proId = new javax.swing.JTextField();
        lab_total = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lab_qty = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lab_totShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Invoice");
        jInternalFrame1.setOpaque(true);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Unit Price", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 700, 200));

        lab_waiterId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_waiterId.setText("Waiter ID :");
        jInternalFrame1.getContentPane().add(lab_waiterId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, 40));
        jInternalFrame1.getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 170, 30));

        lab_proId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_proId.setText("Product ID :");
        jInternalFrame1.getContentPane().add(lab_proId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 100, 40));
        jInternalFrame1.getContentPane().add(txt_proId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 170, 30));

        lab_total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_total.setText("Total :");
        jInternalFrame1.getContentPane().add(lab_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 70, 50));
        jInternalFrame1.getContentPane().add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 170, 30));
        jInternalFrame1.getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 950, 10));

        lab_qty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_qty.setText("Quantity :");
        jInternalFrame1.getContentPane().add(lab_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 80, 40));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 930, 80));

        lab_totShow.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lab_totShow.setText("550");
        lab_totShow.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jInternalFrame1.getContentPane().add(lab_totShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 280, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lab_proId;
    private javax.swing.JLabel lab_qty;
    private javax.swing.JLabel lab_totShow;
    private javax.swing.JLabel lab_total;
    private javax.swing.JLabel lab_waiterId;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_proId;
    private javax.swing.JTextField txt_qty;
    // End of variables declaration//GEN-END:variables
}
