package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameWindow extends JFrame {
    JLabel jLabel = new JLabel();
    TextArea textArea = new TextArea(10, 25);
    JButton jButton = new JButton();

    public NameWindow(String name) throws HeadlessException {
        super("Ваше имя");
        setLayout(new FlowLayout());
        setSize(250, 300);

        add(jLabel);
        jLabel.setText("Вас зовут " + name);

        add(textArea);
        textArea.setText("Напишите отзыв о программе, \nнам важно ваше мнение");

        add(jButton);
        jButton.setText("OK");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
}
