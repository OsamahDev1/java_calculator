import java.awt.Color;

import javax.swing.*;

class MyFrame extends JFrame {

    MyFrame() {
        //body JPanel
        JPanel bodyPanel = new JPanel();
        bodyPanel.setBackground(Color.RED);
        bodyPanel.setBounds(20, 215, 259, 320);

        


        bodyPanel.add(myJButton("test", 0, 200));
        bodyPanel.add(myJButton("test", 50, 200));
        bodyPanel.add(myJButton("test", 100, 200));
        bodyPanel.add(myJButton("test", 150, 200));

        //other bottons
        bodyPanel.add(myJButton("test", 0, 150));
        bodyPanel.add(myJButton("test", 50, 150));
        bodyPanel.add(myJButton("test", 100, 150));
        bodyPanel.add(myJButton("test", 150, 150));
        //the start of 1 to 9
        bodyPanel.add(myJButton("1", 0, 100));
        bodyPanel.add(myJButton("2", 50, 100));
        bodyPanel.add(myJButton("3", 100, 100));
        bodyPanel.add(myJButton("4", 0, 50));
        bodyPanel.add(myJButton("5", 50, 50));
        bodyPanel.add(myJButton("6", 100, 50));
        bodyPanel.add(myJButton("7", 0, 0));
        bodyPanel.add(myJButton("8", 50, 0));
        bodyPanel.add(myJButton("9", 100, 0));
        //the end of 1 to 9

        //the frame
        this.setTitle("osamah's calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(298, 669);
        this.setVisible(true);
        this.add(bodyPanel);
    }

    JButton myJButton(String lable, int x, int y) {

        JButton button = new JButton();
        button.setBounds(x, y, 55, 55);
        button.setText(lable);
        button.setFocusable(false);
        return button;
    }

    // JPanel MyJPanel() {

    //     return bodyPanel;
    // }
}
