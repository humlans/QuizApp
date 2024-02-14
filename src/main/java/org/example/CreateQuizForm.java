package org.example;

import javax.swing.*;

public class CreateQuizForm {
    private JPanel createQuizPanel;

    private JFrame jFrame;
    public CreateQuizForm() {
        jFrame = new JFrame();
        jFrame.pack();
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setContentPane(createQuizPanel);
    }
}
