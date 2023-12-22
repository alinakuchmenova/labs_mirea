import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FontChanger");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel(new BorderLayout());
        JTextArea jTextArea = new JTextArea();
        jTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        jFrame.add(jTextArea);
        JMenuBar jMenuBar = new JMenuBar();
        JMenu color = new JMenu("Color");
        JMenu font = new JMenu("Font");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem black = new JMenuItem("Black");
        JMenuItem roman = new JMenuItem("Times New Roman");
        JMenuItem sans = new JMenuItem("MS Sans Serif");
        JMenuItem courier = new JMenuItem("Courier New");
        color.add(blue);
        color.add(red);
        color.add(black);
        font.add(roman);
        font.add(sans);
        font.add(courier);
        jMenuBar.add(color);
        jMenuBar.add(font);
        jPanel.add(jTextArea, BorderLayout.CENTER);
        jPanel.add(jMenuBar, BorderLayout.NORTH);
        jFrame.add(jPanel);
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(new Color(0, 0, 255));
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(new Color(255, 0, 0));
            }
        });
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(new Color(0, 0, 0));
            }
        });
        roman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 42));
            }
        });
        sans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 42));
            }
        });
        courier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("Courier New", Font.PLAIN, 42));
            }
        });
        jFrame.setVisible(true);
    }
}