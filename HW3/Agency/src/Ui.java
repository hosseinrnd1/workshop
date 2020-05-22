import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.*;

/*
 * Created by JFormDesigner on Thu May 21 23:42:37 IRDT 2020
 */



/**
 * @author hossein
 */
public class Ui extends JFrame {
    public Ui() {
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void button6ActionPerformed(ActionEvent e) {
        Gui gui=new Gui();
        this.setVisible(false);
    }

    private void button1ActionPerformed(ActionEvent e) {
        Tehran_qom tehran_qom=new Tehran_qom();
        this.setVisible(false);
    }

    private void button2ActionPerformed(ActionEvent e) {
        Qom_mashahd qom_mashahd=new Qom_mashahd();
        this.setVisible(false);
    }

    private void button3ActionPerformed(ActionEvent e) {
        Kashan_shiraz kashan_shiraz=new Kashan_shiraz();
        this.setVisible(false);
    }

    private void button4ActionPerformed(ActionEvent e) {
        Qazvin_arak qazvin_arak=new Qazvin_arak();
        this.setVisible(false);
    }

    private void button5ActionPerformed(ActionEvent e) {
        Shiraz_abadan shiraz_abadan=new Shiraz_abadan();
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - hossein
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(102, 255, 255));
        setForeground(new Color(51, 153, 255));
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("tehran-qom");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("qom-mashhad");
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- button3 ----
        button3.setText("kashan-shiraz");
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- button4 ----
        button4.setText("qazvin-arak");
        button4.addActionListener(e -> button4ActionPerformed(e));

        //---- button5 ----
        button5.setText("shiraz-abadan");
        button5.addActionListener(e -> button5ActionPerformed(e));

        //---- button6 ----
        button6.setText("back");
        button6.setForeground(new Color(238, 238, 238));
        button6.setBackground(new Color(0, 51, 51));
        button6.addActionListener(e -> button6ActionPerformed(e));

        //---- label1 ----
        label1.setText("existing trip");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(120, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(button6)
                            .addGap(15, 15, 15))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(151, 151, 151))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                            .addGap(126, 126, 126))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button2)
                    .addGap(8, 8, 8)
                    .addComponent(button3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button4)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button5)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button6)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - hossein
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
