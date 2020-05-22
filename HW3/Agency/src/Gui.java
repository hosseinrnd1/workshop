import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu May 21 23:25:21 IRDT 2020
 */



/**
 * @author hossein
 */
public class Gui extends JFrame {
    public Gui() {
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1ActionPerformed(ActionEvent e) {
        Ui ui=new Ui();
        this.setVisible(false);
    }

    private void button2ActionPerformed(ActionEvent e) {
     System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - hossein
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setAutoRequestFocus(false);
        setBackground(new Color(51, 255, 255));
        setForeground(new Color(0, 102, 102));
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("enter");
        button1.setBackground(new Color(0, 51, 51));
        button1.setForeground(Color.white);
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(135, 90, 100, 40);

        //---- button2 ----
        button2.setText("exit");
        button2.setForeground(Color.white);
        button2.setBackground(new Color(0, 51, 51));
        button2.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
		});
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(300, 230), button2.getPreferredSize()));

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - hossein
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
