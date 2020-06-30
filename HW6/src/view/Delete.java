/*
 * Created by JFormDesigner on Wed Jul 01 03:07:40 IRDT 2020
 */

package view;

import model.PersonEnti;
import model.PersonServ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author hossein2
 */
public class Delete extends JFrame {
    public Delete() {
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void btnbackActionPerformed(ActionEvent e) {
        this.setVisible(false);
        Enter enter=new Enter();
    }

    private void btndeleteActionPerformed(ActionEvent e) {
        String family;

        family=txffamily.getText();


        try {
            PersonServ.getInstance().delete(family);
            JOptionPane.showMessageDialog(this,"deleted");
        }
        catch (Exception e1)
        {
            JOptionPane.showMessageDialog(this,e1.getMessage());
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - hossein2
        txffamily = new JTextField();
        lblfamily = new JLabel();
        btndelete = new JButton();
        btnback = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- txffamily ----
        txffamily.setColumns(10);

        //---- lblfamily ----
        lblfamily.setText("family");

        //---- btndelete ----
        btndelete.setText("delete");
        btndelete.addActionListener(e -> btndeleteActionPerformed(e));

        //---- btnback ----
        btnback.setText("back");
        btnback.addActionListener(e -> btnbackActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(lblfamily)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                    .addComponent(txffamily, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(164, 164, 164))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(btndelete)
                    .addContainerGap(242, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(446, Short.MAX_VALUE)
                    .addComponent(btnback)
                    .addGap(20, 20, 20))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txffamily, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblfamily))
                    .addGap(69, 69, 69)
                    .addComponent(btndelete)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                    .addComponent(btnback)
                    .addGap(18, 18, 18))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - hossein2
    private JTextField txffamily;
    private JLabel lblfamily;
    private JButton btndelete;
    private JButton btnback;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
