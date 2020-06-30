/*
 * Created by JFormDesigner on Wed Jul 01 03:02:51 IRDT 2020
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
public class Update extends JFrame {
    public Update() {
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void btnbackActionPerformed(ActionEvent e) {
        this.setVisible(false);
        Enter enter=new Enter();
    }

    private void btneditActionPerformed(ActionEvent e) {
        String name,family,dateofbirth,fathername;
        name=txfname.getText();
        family=txffamily.getText();
        dateofbirth=txfdateofbirth.getText();
        fathername=txffathername.getText();
        try {
            PersonServ.getInstance().edit(new PersonEnti().setName(name).setFamily(family).setDateoofbirth(dateofbirth).setFathername(fathername));
            JOptionPane.showMessageDialog(this,"updated");
        }
        catch (Exception e1)
        {
            JOptionPane.showMessageDialog(this,e1.getMessage());
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - hossein2
        lblname = new JLabel();
        lblfamily = new JLabel();
        lbldateofbirth = new JLabel();
        lblfathername = new JLabel();
        txfname = new JTextField();
        txffamily = new JTextField();
        txfdateofbirth = new JTextField();
        txffathername = new JTextField();
        btnedit = new JButton();
        btnback = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- lblname ----
        lblname.setText(" new name");

        //---- lblfamily ----
        lblfamily.setText("current family");

        //---- lbldateofbirth ----
        lbldateofbirth.setText("new dateofbirth");

        //---- lblfathername ----
        lblfathername.setText("new fathername");

        //---- txfname ----
        txfname.setColumns(10);

        //---- txffamily ----
        txffamily.setColumns(10);

        //---- txfdateofbirth ----
        txfdateofbirth.setColumns(9);

        //---- txffathername ----
        txffathername.setColumns(10);

        //---- btnedit ----
        btnedit.setText("update");
        btnedit.addActionListener(e -> btneditActionPerformed(e));

        //---- btnback ----
        btnback.setText("back");
        btnback.addActionListener(e -> btnbackActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(lblfamily, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblfathername, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(lbldateofbirth, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(lblname, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                            .addGap(74, 74, 74)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txffamily, GroupLayout.Alignment.TRAILING)
                                        .addComponent(txfdateofbirth, GroupLayout.Alignment.TRAILING))
                                    .addComponent(txfname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addComponent(txffathername, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addGap(163, 163, 163))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(btnedit)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnback)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txfname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblname))
                    .addGap(41, 41, 41)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txffamily, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblfamily))
                    .addGap(36, 36, 36)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(txfdateofbirth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbldateofbirth))
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txffathername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblfathername))
                    .addGap(18, 18, 18)
                    .addComponent(btnedit)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addComponent(btnback)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - hossein2
    private JLabel lblname;
    private JLabel lblfamily;
    private JLabel lbldateofbirth;
    private JLabel lblfathername;
    private JTextField txfname;
    private JTextField txffamily;
    private JTextField txfdateofbirth;
    private JTextField txffathername;
    private JButton btnedit;
    private JButton btnback;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
