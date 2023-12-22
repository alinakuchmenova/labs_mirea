import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        final boolean[] start = {true};
        final String[] text = {""};
        boolean wrongPath = false;
        String path = "C:\\Users\\Быстров Дмитрий\\Desktop\\file.txt";
        try {
            final BufferedWriter[] bufferedWriter = {new BufferedWriter(new FileWriter(path))};
            JFrame jFrame = new JFrame("Hello Swing");
            jFrame.setSize(400, 200);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel jPanel = new JPanel(new BorderLayout());
            JMenuBar jMenuBar = new JMenuBar();
            JMenu file = new JMenu("File");
            JMenu edit = new JMenu("Edit");
            JMenuItem help = new JMenuItem("Help");
            JMenuItem save = new JMenuItem("Save");
            JMenuItem exit = new JMenuItem("Exit");
            JMenuItem copy = new JMenuItem("Copy");
            JMenuItem cut = new JMenuItem("Cut");
            JMenuItem paste = new JMenuItem("Paste");
            file.add(save);
            file.add(exit);
            jMenuBar.add(file);
            edit.add(copy);
            edit.add(cut);
            edit.add(paste);
            jMenuBar.add(edit);
            jMenuBar.add(help);
            JButton jButton1 = new JButton("Button 1");
            JButton jButton2 = new JButton("Button 2");
            JTextArea jTextArea = new JTextArea("This is the area you can write text");
            jTextArea.setRows(3);
            jTextArea.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if(start[0]){
                        jTextArea.setText("");
                        start[0] =false;
                    }
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if(Objects.equals(jTextArea.getText(), "")){
                        jTextArea.setText("This is the area you can write text");
                        start[0] = true;
                    }
                }
            });
            save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        bufferedWriter[0] =new BufferedWriter(new FileWriter(path));
                        bufferedWriter[0].write(jTextArea.getText());
                        bufferedWriter[0].close();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error when saving", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            copy.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(start[0]) text[0] = "";
                    else text[0] = jTextArea.getText();
                }
            });
            cut.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(start[0]) text[0] = "";
                    else {
                        text[0] = jTextArea.getText();
                        jTextArea.setText("This is the area you can write text");
                        start[0] = true;
                    }
                }
            });
            paste.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!text[0].isEmpty()) {
                        jTextArea.setText(jTextArea.getText() + text[0]);
                        start[0] = false;
                    }
                }
            });
            help.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "HELP", "Help", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            JPanel jPanel1 = new JPanel();
            JPanel jPanel2 = new JPanel();
            jPanel1.add(jButton1, BorderLayout.CENTER);
            jPanel2.add(jButton2, BorderLayout.CENTER);
            jPanel.add(jMenuBar, BorderLayout.NORTH);
            jPanel.add(jPanel1, BorderLayout.WEST);
            jPanel.add(jPanel2, BorderLayout.EAST);
            jPanel.add(jTextArea, BorderLayout.SOUTH);
            jFrame.add(jPanel);
            jFrame.setVisible(true);
        } catch (IOException e) {
            wrongPath = true;
        }
    }
}