package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateQuestionForm {
    private JPanel createQuestionPanel;
    private JLabel profileLabel;
    private JTextField textField1;
    private JRadioButton textRadioButton;
    private JRadioButton bothRadioButton;
    private JRadioButton choiceRadioButton;
    private JPanel textPanel;
    private JPanel choicePanel;
    private JPanel bothPanel;
    private JTextArea textArea1;
    private JPanel emptyPanel;
    private JPanel cardPanel;
    private JPanel buttonPanel;
    private JTextField optionField;
    private JButton addButton;
    private JButton removeButton;
    private JList optionList;
    private JRadioButton correctAnswerRadioButton;
    private JFrame jFrame;

    public CreateQuestionForm() {
        jFrame = new JFrame();
        jFrame.pack();
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setContentPane(createQuestionPanel);

        emptyPanel.setVisible(true);
        textPanel.setVisible(false);
        bothPanel.setVisible(false);
        choicePanel.setVisible(false);

        textRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.setVisible(true);
                bothPanel.setVisible(false);
                choicePanel.setVisible(false);

                if(choiceRadioButton.isSelected()){
                    choiceRadioButton.setSelected(false);
                }
                if(bothRadioButton.isSelected()){
                    bothRadioButton.setSelected(false);
                }

            }
        });

        choiceRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.setVisible(false);
                bothPanel.setVisible(false);
                choicePanel.setVisible(true);

                if(textRadioButton.isSelected()){
                    textRadioButton.setSelected(false);
                }
                if(bothRadioButton.isSelected()){
                    bothRadioButton.setSelected(false);
                }
            }
        });

        bothRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.setVisible(false);
                bothPanel.setVisible(true);
                choicePanel.setVisible(false);

                if(choiceRadioButton.isSelected()){
                    choiceRadioButton.setSelected(false);
                }
                if(textRadioButton.isSelected()){
                    textRadioButton.setSelected(false);
                }
            }
        });


    }
}
