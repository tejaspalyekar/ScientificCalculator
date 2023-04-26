import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel calculator;
    private JButton equalsto;
    private JButton xButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton minus;
    private JButton squareroot;
    private JFormattedTextField ans;
    private JButton clear;
    private JButton backspace;
    private JButton rase_to_3;
    private JButton log;
    private JButton remender;
    private JButton dot;
    private JButton reciprocal;
    private JButton xrasetoy;
    private JButton deg;
    private JButton sin;
    private JButton cos;
    private JButton tan;
    private JButton n;
    private JButton plus;
    private JButton x_rase_to_2;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton divide;
    private JLabel header;
     double num1,num2,result;
     String operation,answer;

    public Calculator() {
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ans.setValue("");
            }
        });
        equalsto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (operation == "sin") {
                    ans.setText("");
                    answer = String.format("%.2f",Math.sin(num1));
                    ans.setText(answer);
                }
                else if (operation == "cos") {
                    ans.setText("");
                    answer = String.format("%.2f",Math.cos(num1));
                    ans.setText(answer);
                }
                else if (operation == "tan") {
                    ans.setText("");
                    answer = String.format("%.2f",Math.tan(num1));
                    ans.setText(answer);
                } else if (operation == "log") {
                    ans.setText("");
                    answer = String.format("%.2f",Math.log(num1));
                    ans.setText(answer);
                } else if (operation == "squareroot") {
                    ans.setText("");
                    answer = String.format("%.2f",Math.sqrt(num1));
                    ans.setText(answer);
                }


                num2 = Double.parseDouble(ans.getText());

                if (operation == "+"){
                        result = num1+num2;
                        answer = String.format("%.2f",result);
                        ans.setText(answer);
                    }
                    else if(operation == "-"){
                    result = num1-num2;
                    answer = String.format("%.2f",result);
                    ans.setText(answer);
                    }
                    else if (operation == "x") {
                    result = num1*num2;
                    answer = String.format("%.2f",result);
                    ans.setText(answer);
                }

                else if (operation == "/") {
                    if(num2 == 0){
                        ans.setText("Division by zero error!!");
                    }
                    else{
                        result = num1/num2;
                        answer = String.format("%.2f",result);
                        ans.setText(answer);
                    }
                }
                else if (operation == "%") {
                    result = num1%num2;
                    answer = String.format("%.2f",result);
                    ans.setText(answer);
                }
                else if (operation == "^") {
                    result = Math.pow(num1,num2);
                    answer = String.format("%.2f",result);
                    ans.setText(answer);
                }

            }
        });
        reciprocal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        rase_to_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("");
                result = Math.pow(num1,3);
                answer = String.format("%.2f",result);
                ans.setText(answer);

            }
        });
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("log("+num1+")");
                operation = "log";

            }
        });
        remender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("");
                operation = "%";
            }
        });
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int no = Integer.parseInt(ans.getText());
                ans.setText(no+".");
            }
        });
        xrasetoy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("");
                operation = "^";
            }
        });
        deg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("deg("+num1+")");
                operation = "deg";

            }
        });
        sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                 ans.setText("sin("+num1+")");
                 operation = "sin";

            }
        });
        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("cos("+num1+")");
                operation = "cos";
            }
        });
        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("tan("+num1+")");
                operation = "tan";
            }
        });
        squareroot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("√("+num1+")");
                operation = "squareroot";
            }
        });

        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        n.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText(num1+"+");
                operation = "+";
            }
        });
        x_rase_to_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("");
                result = Math.pow(num1,2);
                answer = String.format("%.2f",result);
                ans.setText(answer);

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = ans.getText() + a7Button.getText();
                ans.setText(num);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = ans.getText() + a8Button.getText();
                ans.setText(num);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = ans.getText() + a9Button.getText();
                ans.setText(num);
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("");
                operation = "-";
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = ans.getText() + a4Button.getText();
                ans.setText(num);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = ans.getText() + a5Button.getText();
                ans.setText(num);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = ans.getText() + a6Button.getText();
                ans.setText(num);
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("");
                operation = "x";
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = ans.getText() + a0Button.getText();
                ans.setText(num);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String num = ans.getText() + a1Button.getText();
                ans.setText(num);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String num = ans.getText() + a2Button.getText();
                /*if(ans.getText() != ""){
                    String a = ans.getText();
                    ans.setText(a+num);
                }*/
                ans.setText(num);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = ans.getText() + a3Button.getText();
                ans.setText(num);
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(ans.getText());
                ans.setText("");
                operation = "/";
            }
      });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
