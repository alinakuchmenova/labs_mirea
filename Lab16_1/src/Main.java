import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static double x = 0;
    static double y = 0;
    static boolean cd = true; //first number or second number
    static boolean pt = true; //before point or after point
    static double ps = 0.1; //multiplier
    static int op = 0;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel(new GridLayout(4, 4));
        JLabel jLabel = new JLabel();
        jLabel.setPreferredSize(new Dimension(360, 80));
        jLabel.setFont(new Font( "Times new roman", Font.BOLD, 20));
        jPanel1.add(jLabel);
        JButton jButton01 = new JButton("7");
        JButton jButton02 = new JButton("8");
        JButton jButton03 = new JButton("9");
        JButton jButton04 = new JButton("/");
        JButton jButton05 = new JButton("4");
        JButton jButton06 = new JButton("5");
        JButton jButton07 = new JButton("6");
        JButton jButton08 = new JButton("*");
        JButton jButton09 = new JButton("1");
        JButton jButton10 = new JButton("2");
        JButton jButton11 = new JButton("3");
        JButton jButton12 = new JButton("-");
        JButton jButton13 = new JButton("0");
        JButton jButton14 = new JButton(".");
        JButton jButton15 = new JButton("=");
        JButton jButton16 = new JButton("+");
        jButton01.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton02.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton03.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton04.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton05.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton06.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton07.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton08.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton09.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton10.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton11.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton12.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton13.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton14.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton15.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jButton16.setFont(new Font( "Times new roman", Font.BOLD, 50));
        jPanel2.add(jButton01);
        jPanel2.add(jButton02);
        jPanel2.add(jButton03);
        jPanel2.add(jButton04);
        jPanel2.add(jButton05);
        jPanel2.add(jButton06);
        jPanel2.add(jButton07);
        jPanel2.add(jButton08);
        jPanel2.add(jButton09);
        jPanel2.add(jButton10);
        jPanel2.add(jButton11);
        jPanel2.add(jButton12);
        jPanel2.add(jButton13);
        jPanel2.add(jButton14);
        jPanel2.add(jButton15);
        jPanel2.add(jButton16);
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=7;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = 8;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = 9;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = 4;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = 5;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = 6;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = 1;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = 2;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = 3;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = 0;
                if(cd){
                    if(pt)x = x*10+num;
                    else {
                        x += ps*num;
                        ps/=10;
                    }
                    jLabel.setText(String.valueOf(x));
                }
                else {
                    if(pt)y = y*10+num;
                    else {
                        y += ps*num;
                        ps/=10;
                    }
                    String o = "";
                    switch (op){
                        case 1->o="+";
                        case 2->o="-";
                        case 3->o="*";
                        case 4->o="/";
                    }
                    jLabel.setText("<html>"+String.valueOf(x)+"<br>"+o+"<br>"+String.valueOf(y)+"</html>");
                }
            }
        });
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cd){
                    cd = false;
                    pt=true;
                    ps=0.1;
                    op = 4;
                    jLabel.setText(String.valueOf(x) + " /");
                }
                else {
                    if(y==0 && op==4){
                        jLabel.setText("ERROR");
                        x=0;
                        y=0;
                        cd=true;
                        pt=true;
                        ps=0.1;
                        ps=0.1;
                    }
                    else {
                        switch (op){
                            case 1->x=x+y;
                            case 2->x=x-y;
                            case 3->x=x*y;
                            case 4->x=x/y;
                        }
                        op = 4;
                        y = 0;
                        jLabel.setText("Result: "+String.valueOf(x));
                    }
                }
            }
        });
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cd){
                    cd = false;
                    pt=true;
                    ps=0.1;
                    op = 3;
                    jLabel.setText(String.valueOf(x) + " *");
                }
                else {
                    switch (op){
                        case 1->x=x+y;
                        case 2->x=x-y;
                        case 3->x=x*y;
                        case 4->x=x/y;
                    }
                    op = 3;
                    y = 0;
                    jLabel.setText("Result: "+String.valueOf(x));
                }
            }
        });
        jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cd){
                    cd = false;
                    pt=true;
                    ps=0.1;
                    op = 2;
                    jLabel.setText(String.valueOf(x) + " -");
                }
                else {
                    switch (op){
                        case 1->x=x+y;
                        case 2->x=x-y;
                        case 3->x=x*y;
                        case 4->x=x/y;
                    }
                    op = 2;
                    y = 0;
                    jLabel.setText("Result: "+String.valueOf(x));
                }
            }
        });
        jButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cd){
                    cd = false;
                    pt=true;
                    ps=0.1;
                    op = 1;
                    jLabel.setText(String.valueOf(x) + " +");
                }
                else {
                    switch (op){
                        case 1->x=x+y;
                        case 2->x=x-y;
                        case 3->x=x*y;
                        case 4->x=x/y;
                    }
                    op = 1;
                    y = 0;
                    jLabel.setText("Result: "+String.valueOf(x));
                }
            }
        });
        jButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(y==0 && op==4){
                    jLabel.setText("ERROR");
                }
                else {
                    if(!cd) {
                        switch (op){
                            case 1->x=x+y;
                            case 2->x=x-y;
                            case 3->x=x*y;
                            case 4->x=x/y;
                        }
                    }
                    jLabel.setText("Result: "+String.valueOf(x));
                }
                x=0;
                y=0;
                cd=true;
                pt=true;
                ps=0.1;
            }
        });
        jButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pt = false;
            }
        });
        jPanel.add(jPanel1, BorderLayout.NORTH);
        jPanel.add(jPanel2, BorderLayout.CENTER);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}