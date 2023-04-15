import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    private JTextField displayField;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonAdd;
    private JButton buttonSubtract;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JButton buttonDecimal;
    private JButton buttonClear;
    private JButton buttonEquals;
    private double result;
    private String lastCommand;
    private boolean start;

    public Calculator() {
        setTitle("Calculator");
        setSize(250, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        displayField = new JTextField();
        contentPane.add(displayField, BorderLayout.NORTH);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonDecimal = new JButton(".");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonClear = new JButton("C");
        buttonEquals = new JButton("=");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonSubtract);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonDecimal);
        buttonPanel.add(buttonEquals);
        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonDivide);
        
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button0.getText();
                displayField.setText(input);
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button1.getText();
                displayField.setText(input);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button2.getText();
                displayField.setText(input);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button3.getText();
                displayField.setText(input);
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button4.getText();
                displayField.setText(input);
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button5.getText();
                displayField.setText(input);
            }
        });

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button6.getText();
                displayField.setText(input);
            }
        });

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button7.getText();
                displayField.setText(input);
            }
        });

        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button8.getText();
                displayField.setText(input);
            }
        });

        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = displayField.getText() + button9.getText();
                displayField.setText(input);
            }
        });

        buttonDecimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!displayField.getText().contains(".")) {
                    String input = displayField.getText() + buttonDecimal.getText();
                    displayField.setText(input);
                }
            }
        });

        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(displayField.getText());
                lastCommand = "+";
                displayField.setText("");
            }
        });

        buttonSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(displayField.getText());
                lastCommand = "-";
                displayField.setText("");
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(displayField.getText());
                lastCommand = "*";
                displayField.setText("");
            }
        });

        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(displayField.getText());
                lastCommand = "/";
                displayField.setText("");
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayField.setText("");
                result = 0;
                lastCommand = "";
            }
        });

        buttonEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double second = Double.parseDouble(displayField.getText());
                if (lastCommand.equals("+")) {
                    result += second;
                } else if (lastCommand.equals("-")) {
                    result -= second;
                } else if (lastCommand.equals("*")) {
                    result *= second;
                } else if (lastCommand.equals("/")) {
                    result /= second;
                }
                displayField.setText("" + result);
                result = 0;
                lastCommand = "";
            }
        });
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}

