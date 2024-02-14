package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomepageForm {
    private JButton editProfileButton;
    private JButton createQuizButton;
    private JButton createQuestionButton;
    private JPanel homepagePanel;

    private JFrame jFrame;

    public HomepageForm() {
        jFrame = new JFrame();
        jFrame.pack();
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setContentPane(homepagePanel);

        createQuizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateQuizForm createQuizForm = new CreateQuizForm();
            }
        });


        createQuestionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateQuestionForm createQuestionForm = new CreateQuestionForm();
            }
        });
    }
}
