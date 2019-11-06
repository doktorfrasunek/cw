package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    JTextField textField;
    double prev=0;
    char lastChar='+';

    public  Window(){
        setSize(new Dimension(500, 500));
        setTitle("Moja aplikacja");
        JPanel glowny = new JPanel();
        glowny.setLayout(null);
        textField = new JTextField(30);
        textField.setBounds(5, 5, 475, 40);
        glowny.add(textField);
        add(glowny);
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4,4));
        buttons.setBounds(5,50,475,360);
        glowny.add(buttons);
        JButton one= new JButton("1");
        one.addActionListener(this);
        JButton two = new JButton("2");
        two.addActionListener(this);
        JButton three= new JButton("3");
        three.addActionListener(this);
        JButton four = new JButton("4");
        four.addActionListener(this);
        JButton five= new JButton("5");
        five.addActionListener(this);
        JButton six = new JButton("6");
        six.addActionListener(this);
        JButton seven = new JButton("7");
        seven.addActionListener(this);
        JButton eight= new JButton("8");
        eight.addActionListener(this);
        JButton nine = new JButton("9");
        nine.addActionListener(this);
        JButton zero = new JButton( "0");
        zero.addActionListener(this);
        JButton plus= new JButton("+");
        plus.addActionListener(this);
        JButton minus = new JButton("-");
        minus.addActionListener(this);
        JButton star = new JButton("*");
        star.addActionListener(this);
        JButton slash= new JButton("/");
        slash.addActionListener(this);
        JButton period = new JButton(".");
        period.addActionListener(this);
        JButton equals = new JButton( "=");
        equals.addActionListener(this);
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(plus);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(minus);
        buttons.add(seven);
        buttons.add(eight);
        buttons.add(nine);
        buttons.add(star);
        buttons.add(zero);
        buttons.add(slash);
        buttons.add(period);
        buttons.add(equals);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        char character= ((JButton) e.getSource()).getText().charAt(0);
        if (Character.isDigit(character) || character=='.') {
            write(character);
        }
        else if(!textField.getText().equals("")) {
            if (lastChar != '=') execute(character, text);
            else {
                if (character != '=') textField.setText("");
                lastChar = character;
            }
        }
    }

    private void execute(char character, String text) {
        Double temp = Double.valueOf(text);
        char lastChar= this.lastChar;
        switch (lastChar){
            case '+':
                prev+=temp;
                break;
            case '-':
                prev-=temp;
                break;
            case '*':
                prev*=temp;
                break;
            case'/':
                if (temp!=0){
                    prev/=temp;
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(), "Nie dzielimy przez zero", "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                    this.lastChar= '=';
                    textField.setText(""+prev);

                    return;
                }
            default:
                break;
        }
        if (character !='=') {

            this.lastChar = character;
            textField.setText("");
        }
        else {
            this.lastChar='=';
            textField.setText(""+prev);
        }

    }


    public void write(char character){
        if(lastChar=='='){
            textField.setText("");
            prev=0;
            lastChar='+';
        }
        String toWrite = textField.getText() + character;

        if (isNumber(toWrite)){
            textField.setText(toWrite);
        }
        else JOptionPane.showMessageDialog(new JFrame(), "Nieprawidlowa liczba", "Dialog",
                JOptionPane.ERROR_MESSAGE);


    }

    boolean isNumber(String string){
        try {
            double d = Double.parseDouble(string);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
}
