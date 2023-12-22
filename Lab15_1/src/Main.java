import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Example");
        jFrame.setSize(230,230);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Times new roman", Font.BOLD, 20);
        JPanel jPanel = new JPanel(new FlowLayout());
        JLabel jLabel1 = new JLabel("1st Number", SwingConstants.CENTER);
        JTextField jTextField1 = new JTextField(10);
        JLabel jLabel2 = new JLabel("2nd Number", SwingConstants.CENTER);
        JTextField jTextField2 = new JTextField(10);
        JButton jButton1 = new JButton("+");
        JButton jButton2 = new JButton("-");
        JButton jButton3 = new JButton("*");
        JButton jButton4 = new JButton("/");
        jTextField1.setFont(font);
        jTextField2.setFont(font);
        jButton1.setFont(font);
        jButton2.setFont(font);
        jButton3.setFont(font);
        jButton4.setFont(font);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x = Double.parseDouble(jTextField1.getText().trim());
                    double y = Double.parseDouble(jTextField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x+y), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error in numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x = Double.parseDouble(jTextField1.getText().trim());
                    double y = Double.parseDouble(jTextField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x-y), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error in numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x = Double.parseDouble(jTextField1.getText().trim());
                    double y = Double.parseDouble(jTextField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x*y), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error in numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x = Double.parseDouble(jTextField1.getText().trim());
                    double y = Double.parseDouble(jTextField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x/y), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error in numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jPanel.add(jLabel1);
        jPanel.add(jTextField1);
        jPanel.add(jLabel2);
        jPanel.add(jTextField2);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}