/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controlPanel;

import control.controlPanel.Actions;
import java.awt.Component;
import javax.swing.JComponent;
import model.controlPanel.BackKey;
import model.controlPanel.PanelVisibility;
import javax.swing.JDesktopPane;

/**
 *
 * @author Naveen
 */
public class ControlPanel extends javax.swing.JInternalFrame {

    /**
     * Creates new form ControlPanel
     */
    //** Class variables
    BackKey backKey;
    PanelVisibility panelVisibility;
    Actions actions;

    public ControlPanel() {
        initComponents();
        initMethod();
        onGoingMethods();
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
        panel_backPanel = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        desktopPane_userAccount = new javax.swing.JDesktopPane();
        tabbedPane_userAccount = new javax.swing.JTabbedPane();
        panel_userAccountHome = new javax.swing.JPanel();
        desktopPane_profPicAccDet = new javax.swing.JDesktopPane();
        label_accountName = new javax.swing.JLabel();
        label_accountType = new javax.swing.JLabel();
        label_passwordDet = new javax.swing.JLabel();
        panel_changeAccountPassword = new javax.swing.JPanel();
        desktopPane_profPicChangePass = new javax.swing.JDesktopPane();
        label_accountNameChangePass = new javax.swing.JLabel();
        label_accountTypeChangePass = new javax.swing.JLabel();
        label_passwordDetChangePass = new javax.swing.JLabel();
        label_changePasswordHeader = new javax.swing.JLabel();
        label_currentPassword = new javax.swing.JLabel();
        label_newPassword = new javax.swing.JLabel();
        label_confirmPassword = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        label_noteChangePassword = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        seperator_changePassword = new javax.swing.JSeparator();
        panel_changeAccountPicture = new javax.swing.JPanel();
        label_changeAccountPictureHeader = new javax.swing.JLabel();
        desktopPane_profPicChangePicture = new javax.swing.JDesktopPane();
        label_accountNameChangePicture = new javax.swing.JLabel();
        label_accountTypeChangePicture = new javax.swing.JLabel();
        label_passwordDetChangePicture = new javax.swing.JLabel();
        label_noteChangePicture = new javax.swing.JLabel();
        seperator_changeAccountPicture = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        layeredPane_picturesChangePicture = new javax.swing.JLayeredPane();
        label_browseForMorePictures = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label_changeAccountNameHeader = new javax.swing.JLabel();
        desktopPane_profPicChangeAccountName = new javax.swing.JDesktopPane();
        label_accountNameChangeAccountName = new javax.swing.JLabel();
        label_accountTypeChangeAccountName = new javax.swing.JLabel();
        label_passwordDetChangeAccountName = new javax.swing.JLabel();
        label_noteChangeAccountName = new javax.swing.JLabel();
        seperator_changeAccountName = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        label_changeAccountName = new javax.swing.JLabel();
        txt_newAccountName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        label_changeAccountTypeHeader = new javax.swing.JLabel();
        desktopPane_profPicChangeAccountType = new javax.swing.JDesktopPane();
        label_accountNameChangeAccountType = new javax.swing.JLabel();
        label_accountTypeChangeAccountType = new javax.swing.JLabel();
        label_passwordDetChangeAccountType = new javax.swing.JLabel();
        seperator_changeAccountType = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Control Panel");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_heading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_heading.setForeground(new java.awt.Color(0, 0, 204));
        label_heading.setText("   Control Panel");
        getContentPane().add(label_heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 780, 10));

        panel_backPanel.setBackground(new java.awt.Color(255, 255, 255));
        panel_backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setText("Back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panel_backPanel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 80, 30));

        getContentPane().add(panel_backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 790, 35));

        desktopPane_userAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedPane_userAccount.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane_userAccount.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPane_userAccount.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        panel_userAccountHome.setBackground(new java.awt.Color(255, 255, 255));
        panel_userAccountHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout desktopPane_profPicAccDetLayout = new javax.swing.GroupLayout(desktopPane_profPicAccDet);
        desktopPane_profPicAccDet.setLayout(desktopPane_profPicAccDetLayout);
        desktopPane_profPicAccDetLayout.setHorizontalGroup(
            desktopPane_profPicAccDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        desktopPane_profPicAccDetLayout.setVerticalGroup(
            desktopPane_profPicAccDetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panel_userAccountHome.add(desktopPane_profPicAccDet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        label_accountName.setText("Account Name");
        panel_userAccountHome.add(label_accountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 290, 30));

        label_accountType.setText("Account Type");
        panel_userAccountHome.add(label_accountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 290, 30));

        label_passwordDet.setText("Password Det");
        panel_userAccountHome.add(label_passwordDet, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 290, 30));

        tabbedPane_userAccount.addTab("Account Details", panel_userAccountHome);

        panel_changeAccountPassword.setBackground(new java.awt.Color(255, 255, 255));
        panel_changeAccountPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout desktopPane_profPicChangePassLayout = new javax.swing.GroupLayout(desktopPane_profPicChangePass);
        desktopPane_profPicChangePass.setLayout(desktopPane_profPicChangePassLayout);
        desktopPane_profPicChangePassLayout.setHorizontalGroup(
            desktopPane_profPicChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        desktopPane_profPicChangePassLayout.setVerticalGroup(
            desktopPane_profPicChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panel_changeAccountPassword.add(desktopPane_profPicChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        label_accountNameChangePass.setText("Account Name");
        panel_changeAccountPassword.add(label_accountNameChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 290, 30));

        label_accountTypeChangePass.setText("Account Type");
        panel_changeAccountPassword.add(label_accountTypeChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 290, 30));

        label_passwordDetChangePass.setText("Password Det");
        panel_changeAccountPassword.add(label_passwordDetChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 290, 30));

        label_changePasswordHeader.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_changePasswordHeader.setForeground(new java.awt.Color(204, 0, 204));
        label_changePasswordHeader.setText("   Change password");
        panel_changeAccountPassword.add(label_changePasswordHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 30));

        label_currentPassword.setText("Current Password");
        panel_changeAccountPassword.add(label_currentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, 30));

        label_newPassword.setText("New Password");
        panel_changeAccountPassword.add(label_newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 130, 30));

        label_confirmPassword.setText("Confirm Password");
        panel_changeAccountPassword.add(label_confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 130, 30));
        panel_changeAccountPassword.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 260, 30));
        panel_changeAccountPassword.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 260, 30));
        panel_changeAccountPassword.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 260, 30));

        label_noteChangePassword.setText("If your password contains capital letters, they must be typed the same way every time you log on.");
        panel_changeAccountPassword.add(label_noteChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 530, 30));

        jButton2.setText("Change Password");
        panel_changeAccountPassword.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 150, 30));

        jButton3.setText("Cancel");
        panel_changeAccountPassword.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 70, 30));
        panel_changeAccountPassword.add(seperator_changePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 640, 10));

        tabbedPane_userAccount.addTab("Change password", panel_changeAccountPassword);

        panel_changeAccountPicture.setBackground(new java.awt.Color(255, 255, 255));
        panel_changeAccountPicture.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_changeAccountPictureHeader.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_changeAccountPictureHeader.setForeground(new java.awt.Color(204, 0, 204));
        label_changeAccountPictureHeader.setText("   Choose a new account picture for your account");
        panel_changeAccountPicture.add(label_changeAccountPictureHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 30));

        javax.swing.GroupLayout desktopPane_profPicChangePictureLayout = new javax.swing.GroupLayout(desktopPane_profPicChangePicture);
        desktopPane_profPicChangePicture.setLayout(desktopPane_profPicChangePictureLayout);
        desktopPane_profPicChangePictureLayout.setHorizontalGroup(
            desktopPane_profPicChangePictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        desktopPane_profPicChangePictureLayout.setVerticalGroup(
            desktopPane_profPicChangePictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panel_changeAccountPicture.add(desktopPane_profPicChangePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        label_accountNameChangePicture.setText("Account Name");
        panel_changeAccountPicture.add(label_accountNameChangePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 290, 30));

        label_accountTypeChangePicture.setText("Account Type");
        panel_changeAccountPicture.add(label_accountTypeChangePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 290, 30));

        label_passwordDetChangePicture.setText("Password Det");
        panel_changeAccountPicture.add(label_passwordDetChangePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 290, 30));

        label_noteChangePicture.setText("The picture you choose will appear on the Start menu");
        panel_changeAccountPicture.add(label_noteChangePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 530, 30));
        panel_changeAccountPicture.add(seperator_changeAccountPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 640, 10));

        jButton4.setText("Change Picture");
        panel_changeAccountPicture.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 150, 30));

        jButton5.setText("Cancel");
        panel_changeAccountPicture.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 70, 30));

        layeredPane_picturesChangePicture.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout layeredPane_picturesChangePictureLayout = new javax.swing.GroupLayout(layeredPane_picturesChangePicture);
        layeredPane_picturesChangePicture.setLayout(layeredPane_picturesChangePictureLayout);
        layeredPane_picturesChangePictureLayout.setHorizontalGroup(
            layeredPane_picturesChangePictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        layeredPane_picturesChangePictureLayout.setVerticalGroup(
            layeredPane_picturesChangePictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        panel_changeAccountPicture.add(layeredPane_picturesChangePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 520, 170));

        label_browseForMorePictures.setForeground(new java.awt.Color(0, 0, 204));
        label_browseForMorePictures.setText("Browse for more pictures");
        panel_changeAccountPicture.add(label_browseForMorePictures, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 170, 30));

        tabbedPane_userAccount.addTab("Change account picture", panel_changeAccountPicture);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_changeAccountNameHeader.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_changeAccountNameHeader.setForeground(new java.awt.Color(204, 0, 204));
        label_changeAccountNameHeader.setText("   Change Account Name");
        jPanel4.add(label_changeAccountNameHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 30));

        javax.swing.GroupLayout desktopPane_profPicChangeAccountNameLayout = new javax.swing.GroupLayout(desktopPane_profPicChangeAccountName);
        desktopPane_profPicChangeAccountName.setLayout(desktopPane_profPicChangeAccountNameLayout);
        desktopPane_profPicChangeAccountNameLayout.setHorizontalGroup(
            desktopPane_profPicChangeAccountNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        desktopPane_profPicChangeAccountNameLayout.setVerticalGroup(
            desktopPane_profPicChangeAccountNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(desktopPane_profPicChangeAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        label_accountNameChangeAccountName.setText("Account Name");
        jPanel4.add(label_accountNameChangeAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 290, 30));

        label_accountTypeChangeAccountName.setText("Account Type");
        jPanel4.add(label_accountTypeChangeAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 290, 30));

        label_passwordDetChangeAccountName.setText("Password Det");
        jPanel4.add(label_passwordDetChangeAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 290, 30));

        label_noteChangeAccountName.setText("This name will appear on the start menu");
        jPanel4.add(label_noteChangeAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 530, 30));
        jPanel4.add(seperator_changeAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 640, 10));

        jButton6.setText("Change Name");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 150, 30));

        jButton7.setText("Cancel");
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 70, 30));

        label_changeAccountName.setText("New Account Name");
        jPanel4.add(label_changeAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, 30));
        jPanel4.add(txt_newAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 280, 30));

        tabbedPane_userAccount.addTab("Change account name", jPanel4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_changeAccountTypeHeader.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_changeAccountTypeHeader.setForeground(new java.awt.Color(204, 0, 204));
        label_changeAccountTypeHeader.setText("   Change Account Type");
        jPanel1.add(label_changeAccountTypeHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 30));

        javax.swing.GroupLayout desktopPane_profPicChangeAccountTypeLayout = new javax.swing.GroupLayout(desktopPane_profPicChangeAccountType);
        desktopPane_profPicChangeAccountType.setLayout(desktopPane_profPicChangeAccountTypeLayout);
        desktopPane_profPicChangeAccountTypeLayout.setHorizontalGroup(
            desktopPane_profPicChangeAccountTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        desktopPane_profPicChangeAccountTypeLayout.setVerticalGroup(
            desktopPane_profPicChangeAccountTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(desktopPane_profPicChangeAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        label_accountNameChangeAccountType.setText("Account Name");
        jPanel1.add(label_accountNameChangeAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 290, 30));

        label_accountTypeChangeAccountType.setText("Account Type");
        jPanel1.add(label_accountTypeChangeAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 290, 30));

        label_passwordDetChangeAccountType.setText("Password Det");
        jPanel1.add(label_passwordDetChangeAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 290, 30));
        jPanel1.add(seperator_changeAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 640, 10));

        jButton8.setText("Change Account Type");
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 160, 30));

        jButton9.setText("Cancel");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 70, 30));

        tabbedPane_userAccount.addTab("Change Account Type", jPanel1);

        desktopPane_userAccount.add(tabbedPane_userAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 480));

        getContentPane().add(desktopPane_userAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 790, 480));

        jButton1.setText("User Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background/background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 575));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        navigate(desktopPane_userAccount,desktopPane_userAccount,panel_backPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        backKey.goBack(panel_backPanel);
    }//GEN-LAST:event_jButton10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JDesktopPane desktopPane_profPicAccDet;
    private javax.swing.JDesktopPane desktopPane_profPicChangeAccountName;
    private javax.swing.JDesktopPane desktopPane_profPicChangeAccountType;
    private javax.swing.JDesktopPane desktopPane_profPicChangePass;
    private javax.swing.JDesktopPane desktopPane_profPicChangePicture;
    private javax.swing.JDesktopPane desktopPane_userAccount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_accountName;
    private javax.swing.JLabel label_accountNameChangeAccountName;
    private javax.swing.JLabel label_accountNameChangeAccountType;
    private javax.swing.JLabel label_accountNameChangePass;
    private javax.swing.JLabel label_accountNameChangePicture;
    private javax.swing.JLabel label_accountType;
    private javax.swing.JLabel label_accountTypeChangeAccountName;
    private javax.swing.JLabel label_accountTypeChangeAccountType;
    private javax.swing.JLabel label_accountTypeChangePass;
    private javax.swing.JLabel label_accountTypeChangePicture;
    private javax.swing.JLabel label_browseForMorePictures;
    private javax.swing.JLabel label_changeAccountName;
    private javax.swing.JLabel label_changeAccountNameHeader;
    private javax.swing.JLabel label_changeAccountPictureHeader;
    private javax.swing.JLabel label_changeAccountTypeHeader;
    private javax.swing.JLabel label_changePasswordHeader;
    private javax.swing.JLabel label_confirmPassword;
    private javax.swing.JLabel label_currentPassword;
    private javax.swing.JLabel label_heading;
    private javax.swing.JLabel label_newPassword;
    private javax.swing.JLabel label_noteChangeAccountName;
    private javax.swing.JLabel label_noteChangePassword;
    private javax.swing.JLabel label_noteChangePicture;
    private javax.swing.JLabel label_passwordDet;
    private javax.swing.JLabel label_passwordDetChangeAccountName;
    private javax.swing.JLabel label_passwordDetChangeAccountType;
    private javax.swing.JLabel label_passwordDetChangePass;
    private javax.swing.JLabel label_passwordDetChangePicture;
    private javax.swing.JLayeredPane layeredPane_picturesChangePicture;
    private javax.swing.JPanel panel_backPanel;
    private javax.swing.JPanel panel_changeAccountPassword;
    private javax.swing.JPanel panel_changeAccountPicture;
    private javax.swing.JPanel panel_userAccountHome;
    private javax.swing.JSeparator seperator_changeAccountName;
    private javax.swing.JSeparator seperator_changeAccountPicture;
    private javax.swing.JSeparator seperator_changeAccountType;
    private javax.swing.JSeparator seperator_changePassword;
    private javax.swing.JTabbedPane tabbedPane_userAccount;
    private javax.swing.JTextField txt_newAccountName;
    // End of variables declaration//GEN-END:variables

       private void onGoingMethods() {
        panelVisibility.visibilityFalse(desktopPane_userAccount,panel_backPanel);
    }

    private void initMethod() {
        if (actions == null) {
            actions = new Actions();
        }
        if (panelVisibility == null) {
            panelVisibility = new PanelVisibility();
        }
        if (backKey == null) {
            backKey = new BackKey();
        }
    }

    private void navigate(JDesktopPane currDesktopPane,JComponent... components) {
        panelVisibility.visibilityTrue(currDesktopPane,components);
    }

}
