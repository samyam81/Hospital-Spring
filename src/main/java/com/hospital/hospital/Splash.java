package com.hospital.hospital;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame implements ActionListener {

    JFrame frame;
    JLabel hospitallLabel, motoLabel;
    JButton start;

    Splash() {
        // Defining the frame
        frame = new JFrame("Om hospital");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0, 0, 0));

        hospitallLabel = new JLabel("Om hospital");
        hospitallLabel.setForeground(new Color(192, 192, 192));
        hospitallLabel.setBounds(150, 100, 400, 50);

        motoLabel = new JLabel("Serving the Best");
        motoLabel.setForeground(new Color(188, 198, 204));
        motoLabel.setBounds(200, 150, 150, 80);

        start = new JButton("Click to start");
        start.addActionListener(this); // corrected ActionListener interface name
        start.setFocusable(false);
        start.setBackground(new Color(112, 128, 144));
        start.setForeground(new Color(249, 246, 238));
        start.setBounds(585, 421, 142, 45);

        frame.add(hospitallLabel);
        frame.add(motoLabel);
        frame.add(start); // added start button

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Code to be executed when the button is clicked
        // will code later
    }

    public static void main(String[] args) {
        new Splash();
    }
}
