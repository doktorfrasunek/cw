package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Window extends JFrame {
    public Window(){
        setSize(new Dimension(500, 500));
        setTitle("Moja aplikacja");
        JPanel glowny = new JPanel();
        glowny.setLayout(null);

        JButton clean = new JButton("Wyczysc");
        clean.setBounds(100, 400, 75, 30);
        glowny.add(clean);
        JButton set= new JButton("Generuj haslo");
        set.setBounds(175, 400, 75, 30);
        glowny.add(set);
        JButton send = new JButton("Wyslij");
        send.setBounds(250, 400, 75, 30);
        glowny.add(send);
        JTextField login = new JTextField(30);
        login.setBounds(5, 5, 475, 40);
        glowny.add(login);
        JTextField haslo = new JTextField(30);
        haslo.setBounds(5, 60, 475, 40);
        glowny.add(haslo);
        JRadioButton jRadioButton1 = new JRadioButton();
        jRadioButton1.setBounds(20,80,40,40);
        JLabel jLabel1= new JLabel("pierwszy");
        jLabel1.setBounds(30,80,100,100);
        JRadioButton jRadioButton2 = new JRadioButton();
        jRadioButton2.setBounds(20,160,40,40);
        JLabel jLabel2= new JLabel("drugi");

        jLabel2.setBounds(30,200,100,100);
        //glowny.add(jRadioButton1);
        //glowny.add(jRadioButton2);
       // glowny.add(jLabel1);
       // glowny.add(jLabel2);
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1);
        group.add(jRadioButton2);

        clean.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                login.setText("");
                haslo.setText("");
            }
        });

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sLogin= login.getText();
                String sHaslo= haslo.getText();
                if (sLogin.equals("")){
                    JOptionPane.showMessageDialog(new JFrame(), "Podaj login", "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                }
                else if (sHaslo.equals("")){
                    JOptionPane.showMessageDialog(new JFrame(), "Podaj haslo", "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                }
                else if (sHaslo.length()<8){
                    JOptionPane.showMessageDialog(new JFrame(), "Haslo musi miec przynajmniej 8 znakow", "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                }
                else if (!duzaMalaCyfra(sHaslo)){
                  JOptionPane.showMessageDialog(new JFrame(), "Haslo musi miec 1 duza i 1 mala litere oraz cyfre", "Dialog",
                           JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        set.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                haslo.setText(generujHaslo());
            }
        });

        add(glowny);
    }
    boolean duzaMalaCyfra(String haslo) {

        return haslo.matches(".*\\d.*") && haslo.matches(".*[a-z].*") && haslo.matches(".*[A-Z].*");
    }
    String generujHaslo(){
        ArrayList<Character> list= new ArrayList<>();
        for (int i =41; i <126 ; i++) {
            list.add((char)i);
        }
        //for (int i = 65; i <91 ; i++) {
        //    list.add((char)i);
       // }
       // for (int i = 48; i <58 ; i++) {
       //     list.add((char)i);
       // }
        StringBuilder stringBuilder= new StringBuilder();
        Random random= new Random();
        boolean cyfra = false;
        boolean duza= false;
        boolean mala= false;
        boolean znak= false;
        while(stringBuilder.toString().length()<8 ){
            int i= random.nextInt(list.size());
            char c= list.get(i);

            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
