/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.controlPanel;

/**
 *
 * @author Naveen
 */
public class ControlPanel extends javax.swing.JInternalFrame {

    /**
     * Creates new form ControlPanel
     */
    public ControlPanel() {
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

        label_heading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        background = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Control Panel");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_heading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_heading.setForeground(new java.awt.Color(0, 0, 204));
        label_heading.setText("   Control Panel");
        getContentPane().add(label_heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 780, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 780, 10));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background/background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 575));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_heading;
    // End of variables declaration//GEN-END:variables
}
