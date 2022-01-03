import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends  JFrame {
    private JPanel div1;
    private JPanel div_Content;
    private JTextField element_input;
    private JLabel element_lable;
    private JButton b20;
    private JButton b19;
    private JButton b16;
    private JButton b15;
    private JButton b11;
    private JButton b7;
    private JButton b3;
    private JButton b14;
    private JButton b13;
    private JButton b12;
    private JButton b10;
    private JButton b9;
    private JButton b8;
    private JButton b6;
    private JButton b5;
    private JButton b4;
    private JButton b2;
    private JButton b1;
    private JRadioButton onRadioButton;
    private JRadioButton offRadioButton;
    private JPanel div_RadioInput;

    private char operator ;
    private double num;
    private double result;

    public Main(){
        this.setContentPane(div1);
        this.setTitle("Tachenrechner");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setMaximumSize(new Dimension(600, 500));
        this.setMinimumSize(new Dimension(300, 400));
        this.pack();
        setVisible(true);
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "0");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + ".");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //element_input.setText(element_input.getText() + "=");
                rechnen();
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "1");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "2");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "3");
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "0");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_lable.setText(element_input.getText() + " / ");
                operator = '/';
                num =  element_input.getText().length() == 0 ? 0.0: Double.parseDouble(element_input.getText());
                element_input.setText("");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "4");
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "5");
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "6");
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_lable.setText(element_input.getText() + " * ");
                operator = '*';
                num =  element_input.getText().length() == 0 ? 0.0: Double.parseDouble(element_input.getText());
                element_input.setText("");
            }
        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "7");
            }
        });
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "8");
            }
        });
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText(element_input.getText() + "9");
            }
        });
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    element_lable.setText(element_input.getText() + " - ");
                    operator = '-';
                    num = element_input.getText().length() == 0 ? 0.0: Double.parseDouble(element_input.getText());
                    element_input.setText("");
            }
        });
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newText = "";
                if(element_input.getText().length() > 0) {
                    newText = element_input.getText().substring(0, element_input.getText().length() - 1);
                }
                element_input.setText(newText);
            }
        });
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_input.setText("");
            }
        });
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                element_lable.setText(element_input.getText() + " + ");
                operator = '+';
                num = element_input.getText().length() == 0 ? 0.0: Double.parseDouble(element_input.getText());
                element_input.setText("");
            }
        });


        onRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enabled();
            }
        });
        offRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disabled();
            }
        });
    }
    private void disabled(){
        offRadioButton.setEnabled(false);
        onRadioButton.setEnabled(true);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        b13.setEnabled(false);
        b14.setEnabled(false);
        b15.setEnabled(false);
        b16.setEnabled(false);
        b19.setEnabled(false);
        b20.setEnabled(false);
        element_lable.setEnabled(false);
        element_lable.setEnabled(false);
    }
    private void enabled(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b16.setEnabled(true);
        b19.setEnabled(true);
        b20.setEnabled(true);
        element_lable.setEnabled(true);
        element_lable.setEnabled(true);
    }
    private void rechnen(){
        switch (operator){
            case '+':
                result = num + Double.parseDouble(element_input.getText());
                element_input.setText(Double.toString(result));
                element_lable.setText("");
                break;
            case '-':
                result = num - Double.parseDouble(element_input.getText());
                element_input.setText(Double.toString(result));
                element_lable.setText("");
                break;
            case '*':
                result = num * Double.parseDouble(element_input.getText());
                element_input.setText(Double.toString(result));
                element_lable.setText("");
                break;
            case '/':
                result = num / Double.parseDouble(element_input.getText());
                element_input.setText(Double.toString(result));
                element_lable.setText("");
                break;
        }
    }

    public static void main (String[] args){
        Main mymain = new Main();
    }
}
