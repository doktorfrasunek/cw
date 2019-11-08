package NotePad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Window extends JFrame {
    File file;
    JTextArea jTextArea;
    public Window(){
        setSize(new Dimension(500, 500));
        setTitle("notatnik");
        JPanel glowny = new JPanel();
        BorderLayout layout = new BorderLayout();
        glowny.setLayout(layout);
        jTextArea= new JTextArea();
        glowny.add(jTextArea,BorderLayout.CENTER);
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,2));
        glowny.add(buttons,BorderLayout.PAGE_END);
        JButton open = new JButton("open");
        JButton save = new JButton("save");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    open();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        buttons.add(open);
        buttons.add(save);

        add(glowny);

    }

    private void open() throws FileNotFoundException {
        JFileChooser jFileChooser = new JFileChooser(File.listRoots()[0]);
        int decision= jFileChooser.showOpenDialog(null);
        if(decision== JFileChooser.APPROVE_OPTION){
            file= jFileChooser.getSelectedFile();
            String content = new Scanner(file).useDelimiter("\\Z").next();
            jTextArea.setText(content);

        }
    }
}
