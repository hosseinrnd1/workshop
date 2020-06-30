/*
 * Created by JFormDesigner on Wed Jul 01 03:10:02 IRDT 2020
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author hossein2
 */
public class Enter extends JFrame {
    public Enter() {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        this.setVisible(false);
        Registmellicard registmellicard=new Registmellicard();

    }

    private void button2ActionPerformed(ActionEvent e) {
        this.setVisible(false);
        Update update=new Update();
    }

    private void button3ActionPerformed(ActionEvent e) {
        this.setVisible(false);
        Delete delete= new Delete();

    }

    private void button4ActionPerformed(ActionEvent e) {
        System.exit(1);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - hossein2
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("request");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("update");
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("delete");
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("exit");
        button4.addActionListener(e -> button4ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(192, 192, 192)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(236, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(button1)
                    .addGap(35, 35, 35)
                    .addComponent(button2)
                    .addGap(33, 33, 33)
                    .addComponent(button3)
                    .addGap(34, 34, 34)
                    .addComponent(button4)
                    .addContainerGap(111, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - hossein2
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
