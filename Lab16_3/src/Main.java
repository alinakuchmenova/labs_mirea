import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

public class Main {
    public static String s1 = "Java";
    public static String s2 = "Human";
    public static String s3 = "qwerty";
    public static String e1 = "";
    public static String e2 = "";
    public static String e3 = "";
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Password");
        jFrame.setSize(400, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel service = new JLabel("Service: ");
        JLabel userName = new JLabel("User name: ");
        JLabel password = new JLabel("Password: ");
        JTextArea jTextArea1 = new JTextArea();
        JTextArea jTextArea2 = new JTextArea();
        JTextArea jTextArea3 = new JTextArea();
        jTextArea1.setColumns(25);
        jTextArea2.setColumns(25);
        jTextArea3.setColumns(25);
        JPanel jPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel.add(service, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        jPanel.add(userName, gridBagConstraints);
        gridBagConstraints.gridy = 2;
        jPanel.add(password, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 4;
        jPanel.add(jTextArea1, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        jPanel.add(jTextArea2, gridBagConstraints);
        gridBagConstraints.gridy = 2;
        jPanel.add(jTextArea3, gridBagConstraints);
        jFrame.add(jPanel);
        jTextArea1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    if (!Objects.equals(s1, e1)){
                        JOptionPane.showMessageDialog(null, "Wrong service", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (!Objects.equals(s2, e2)){
                        JOptionPane.showMessageDialog(null, "User does not exist", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (!Objects.equals(s3, e3)) {
                        JOptionPane.showMessageDialog(null, "Wrong password", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    jTextArea1.setText(e1);
                }
                else {
                    e1 = jTextArea1.getText();
                }
            }
        });
        jTextArea2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    if (!Objects.equals(s1, e1)){
                        JOptionPane.showMessageDialog(null, "Wrong service", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (!Objects.equals(s2, e2)){
                        JOptionPane.showMessageDialog(null, "User does not exist", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (!Objects.equals(s3, e3)) {
                        JOptionPane.showMessageDialog(null, "Wrong password", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    jTextArea2.setText(e2);
                }
                else {
                    e2 = jTextArea2.getText();
                }
            }
        });
        jTextArea3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    if (!Objects.equals(s1, e1)){
                        JOptionPane.showMessageDialog(null, "Wrong service", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (!Objects.equals(s2, e2)){
                        JOptionPane.showMessageDialog(null, "User does not exist", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (!Objects.equals(s3, e3)) {
                        JOptionPane.showMessageDialog(null, "Wrong password", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    jTextArea3.setText(e3);
                }
                else {
                    e3 = jTextArea3.getText();
                }
            }
        });
        jFrame.setVisible(true);
    }
}