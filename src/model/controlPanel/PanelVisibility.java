/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.controlPanel;

import javax.swing.JComponent;
import javax.swing.JDesktopPane;

/**
 *
 * @author Naveen
 */
public class PanelVisibility {

    static JDesktopPane currenDesktopPane;

    public final void visibilityFalse(JComponent... components) {
        for (int i = 0; i < components.length; i++) {
            components[i].setVisible(false);
        }
    }

    public final void visibilityTrue(JDesktopPane currentDesktopPane, JComponent... components) {
        for (int i = 0; i < components.length; i++) {
            components[i].setVisible(true);
        }
        PanelVisibility.currenDesktopPane = currentDesktopPane;
    }

}
