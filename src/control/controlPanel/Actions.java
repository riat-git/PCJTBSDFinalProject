/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.controlPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.controlPanel.Update;
import model.controlPanel.Validation;

/**
 *
 * @author Naveen
 */
public class Actions {

    Update update;
    Validation validation;

    String currentPass;
    String newPass;
    String confirmPass;
    String loginId;

    public Actions(String loginId) {

        this.loginId = loginId;

        if (update == null) {
            update = new Update();
        }
        if (validation == null) {
            validation = new Validation();
        }
    }

    public void actionPassword(JButton changePass, final JPasswordField currentPass, final JPasswordField newPass, final JPasswordField confirmPass) {

        this.currentPass = new String(currentPass.getPassword());
        this.newPass = new String(newPass.getPassword());
        this.confirmPass = new String(confirmPass.getPassword());

        changePass.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (validation.checkCurrPassword(Actions.this.currentPass, loginId)) {
                    if (validation.checkNewPass(Actions.this.newPass, Actions.this.confirmPass)) {
                        update.changePassword(Actions.this.newPass, loginId);
                    }else{
                        response.Response.error("Sorry 'New Password and Confirm Password' you entered did not match! :-(");
                    }
                }else{
                    response.Response.error("Sorry The current password you entered is incorrect! :-(");
                }
            }
        });
    }

}
