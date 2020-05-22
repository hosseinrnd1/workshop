import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri May 22 00:05:37 IRDT 2020
 */



/**
 * @author hossein
 */
public class Tehran_qom extends JFrame {
    public Tehran_qom() {
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1ActionPerformed(ActionEvent e) {

        label1.setText("you bought tehran_qom ticket");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - hossein
        button1 = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("buy");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- label1 ----
        label1.setText(" ");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(149, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(107, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - hossein
    private JButton button1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
