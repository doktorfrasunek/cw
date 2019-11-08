package zaawanoswaneObiekty.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAcount {
    static ActionListener actionListener = new Counter();
    static boolean keepWorking= true;
    static Timer timer;

    public static void main(String[] args) {
        JButton b=new JButton("Stop");
        b.setBounds(100,100,140, 40);
        JFrame f = new JFrame("Stop");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                timer.stop();
            }
        });
        f.add(b);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(new FlowLayout());
        f.pack();
        f.setVisible(true);

        actionListener.actionPerformed(null);
        timer = new Timer(20,actionListener);

            timer.start();


    }




}
class Counter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Wowie");
    }

}

