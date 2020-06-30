/*
 * Created by JFormDesigner on Wed Jul 01 02:58:19 IRDT 2020
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
public class Registmellicard extends JFrame {
    public Registmellicard() {
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void btnbackActionPerformed(ActionEvent e) {
        this.setVisible(false);
        Enter enter=new Enter();
    }

    private void btnregistActionPerformed(ActionEvent e) {
        String name,family,dateofbirth,fathername;
        name=txfname.getText();
        family=txffamily.getText();
        dateofbirth=txfdateofbirth.getText();
        fathername=txffathername.getText();
        try {
            PersonServ.getInstance().save(new PersonEnti().setName(name).setFamily(family).setDateoofbirth(dateofbirth).setFathername(fathername));
            JOptionPane.showMessageDialog(this,"registed");
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
        btnregist = new JButton();
        btnback = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- lblname ----
        lblname.setText(" name");

        //---- lblfamily ----
        lblfamily.setText(" family");

        //---- lbldateofbirth ----
        lbldateofbirth.setText(" dateofbirth");

        //---- lblfathername ----
        lblfathername.setText(" fathername");

        //---- txfname ----
        txfname.setColumns(10);

        //---- txffamily ----
        txffamily.setColumns(10);

        //---- txfdateofbirth ----
        txfdateofbirth.setColumns(9);

        //---- txffathername ----
        txffathername.setColumns(10);

        //---- btnregist ----
        btnregist.setText("regist");
        btnregist.addActionListener(e -> btnregistActionPerformed(e));

        //---- btnback ----
        btnback.setText("back");
        btnback.addActionListener(e -> btnbackActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(lblfathername, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addGap(125, 125, 125)
                                    .addComponent(txffathername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblname)
                                        .addComponent(lblfamily))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 115, Short.MAX_VALUE)
                            .addComponent(lbldateofbirth, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                            .addGap(125, 125, 125)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(txffamily)
                                .addComponent(txfname)
                                .addComponent(txfdateofbirth))))
                    .addGap(87, 87, 87))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(226, 226, 226)
                    .addComponent(btnregist)
                    .addContainerGap(240, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(460, Short.MAX_VALUE)
                    .addComponent(btnback)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txfname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblname))
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txffamily, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblfamily))
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txfdateofbirth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbldateofbirth))
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txffathername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblfathername))
                    .addGap(18, 18, 18)
                    .addComponent(btnregist)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
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
    private JButton btnregist;
    private JButton btnback;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
