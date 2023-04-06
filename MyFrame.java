import java.awt.Color;

import javax.swing.*;

class MyFrame extends JFrame {

    MyFrame() {
        JPanel bodyPanel = new JPanel();
        // bodyPanel.setBackground(Color.WHITE);
        bodyPanel.setBounds(15, 200, 260, 320);
        bodyPanel.add(myJButton("1", 0, 200));
        bodyPanel.add(myJButton("2", 100, 200));
        bodyPanel.add(myJButton("3", 200, 200));
        bodyPanel.add(myJButton("4", 0, 100));
        bodyPanel.add(myJButton("5", 100, 100));
        bodyPanel.add(myJButton("6", 200, 100));
        bodyPanel.add(myJButton("7", 0, 0));
        bodyPanel.add(myJButton("8", 100, 0));
        bodyPanel.add(myJButton("9", 200, 0));

        this.setTitle("osamah's calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(290, 570);
        this.setVisible(true);
        this.add(bodyPanel);
    }

    JButton myJButton(String lable, int x, int y) {

        JButton button = new JButton();
        button.setBounds(x, y, 60, 60);
        button.setText(lable);
        button.setFocusable(false);
        return button;
    }

    // JPanel MyJPanel() {

    //     return bodyPanel;
    // }
}
