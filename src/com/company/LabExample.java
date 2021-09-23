package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExample extends JFrame {
    JTextField jTextField = new JTextField(10);
    JLabel jLabel = new JLabel();
    JButton jButton = new JButton();
    Font font = new Font("Times new roman", Font.BOLD, 20);

    public LabExample() throws HeadlessException {
        super("Best program");
        setLayout(new BorderLayout());
        setSize(400, 150);

        add(jLabel, BorderLayout.NORTH);
        jLabel.setText("Введите имя");

        add(jTextField, BorderLayout.CENTER);
        jTextField.setForeground(Color.RED);
        jTextField.setFont(font);

        add(jButton, BorderLayout.SOUTH);
        jButton.setText("Готово");
        jButton.addActionListener(e -> {
            new NameWindow(jTextField.getText());
        });

        setVisible(true);
    }
}
